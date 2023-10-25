/**
 * Copyright 2021 USpeedo Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.uspeedo.common.credential;

import com.uspeedo.common.exception.USpeedoException;
import com.uspeedo.common.request.Request;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Credential is an object to represent the credential information
 */
public class Credential {

    private String privateKey;
    private String publicKey;

    /**
     * Credential constructor
     *
     * @param publicKey  Public Key
     * @param privateKey
     */
    public Credential(String publicKey, String privateKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    public String verifyAc(Request request) throws USpeedoException {
        Map<String, Object> params = request.encode();
        String[] keys = params.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        try {
            DecimalFormat df = new DecimalFormat("#");
            df.setMaximumFractionDigits(Integer.MAX_VALUE);
            StringBuilder concatenatedString = new StringBuilder();

            for (String key : keys) {
                concatenatedString.append(key)
                    .append(any2String(params.get(key)));
            }
            concatenatedString.append(privateKey);

            return sha1(concatenatedString.toString());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new USpeedoException("SHA-1 error", e);
        }
    }

    public Request sign(Request request) throws USpeedoException {
        request.setSignature(verifyAc(request));
        // Not involved in signature calculation
        request.setPublicKey(this.publicKey);
        return request;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    private String any2String(Object v) {
        if (v instanceof String || v instanceof Boolean || v instanceof Number) {
            return simple2String(v);
        } else if (v instanceof List) {
            return slice2String((List<?>) v);
        } else if (v instanceof Map) {
            return map2String((Map<String, Object>) v);
        } else {
            return v.toString();
        }
    }

    public static String simple2String(Object v) {
        if (v instanceof Boolean) {
            return Boolean.toString((Boolean) v);
        } else {
            return String.valueOf(v);
        }
    }

    private String slice2String(List<?> arr) {
        StringBuilder str = new StringBuilder();
        for (Object v : arr) {
            str.append(any2String(v));
        }
        return str.toString();
    }

    public static String[] extractKeys(Map<String, Object> m) {
        String[] keys = m.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        return keys;
    }

    private String map2String(Map<String, Object> params) {
        StringBuilder str = new StringBuilder();
        for (String k : extractKeys(params)) {
            str.append(k).append(any2String(params.get(k)));
        }
        return str.toString();
    }

    private String sha1(String s) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // Security Consideration: SHA-1 is deprecated for cryptographic use; consider using a more secure algorithm.
        return formatBytes2HexString(DigestUtils.sha1(s));
    }

    public String formatBytes2HexString(byte[] data) {
        if (data == null || data.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
