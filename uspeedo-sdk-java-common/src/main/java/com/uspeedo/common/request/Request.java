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
package com.uspeedo.common.request;

import com.uspeedo.common.annotation.NotEmpty;
import com.uspeedo.common.annotation.USpeedoParam;
import com.uspeedo.common.exception.USpeedoException;
import com.uspeedo.common.exception.ValidatorException;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Request is the base-class of all request object
 */
public class Request extends RequestOptions {
    @USpeedoParam("Signature")
    private String signature;

    @USpeedoParam("Action")
    private String action;

    @USpeedoParam("PublicKey")
    private String publicKey;

    public Request() {
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Encode will encode the request object to a map
     *
     * @return map representation of request
     */
    public Map<String, Object> encode() throws USpeedoException {
        try {
            return encodeObject(this);
        } catch (ClassNotFoundException | IllegalAccessException e) {
            throw new USpeedoException("cannot encode: " + e.getMessage(), e);
        }
    }

    private static Map<String, Object> encodeObject(Object obj)
        throws ClassNotFoundException, IllegalAccessException, USpeedoException {
        Map<String, Object> params = new HashMap<>();

        for (Field field : getAllFields(obj.getClass())) {
            // only collect field with param paramAnnotation
            USpeedoParam paramAnnotation = field.getAnnotation(USpeedoParam.class);
            if (paramAnnotation == null) {
                continue;
            }
            String key = paramAnnotation.value();
            // Only pass parameters through header, not as body content
            if (key.equals("PublicKey") || key.equals("Signature")) {
                continue;
            }
            NotEmpty requiredAnnotation = field.getAnnotation(NotEmpty.class);

            // get field value
            field.setAccessible(true);
            Object value = field.get(obj);
            if (requiredAnnotation != null && value == null) {
                throw new ValidatorException(
                    String.format("%s can not be null", paramAnnotation.value()));
            }
            if (value == null) {
                continue;
            }

            // visit field recursive
            if (isPrimitive(value)) {
                params.put(key, value);
            } else if (isArray(value)) {
                List<Object> listValue = (List) value;
                List<Object> newList = new ArrayList<>();
                for (Object item : listValue) {
                    if (isObject(item)) {
                        newList.add(encodeObject(item));
                    } else {
                        newList.add(item);
                    }
                }
                params.put(key, newList);
            } else if (isObject(value)) {
                params.put(key, encodeObject(value));
            } else {
                throw new ClassNotFoundException(
                    "invalid class ".concat(value.getClass().getName()));
            }
        }
        return params;
    }

    private static Boolean isArray(Object value) {
        return (value instanceof List);
    }

    private static Boolean isObject(Object value) {
        return value instanceof Request;
    }

    private static Boolean isPrimitive(Object value) {
        return (value instanceof Number || value instanceof String || value instanceof Boolean);
    }

    private static List<Field> getAllFields(Class<?> type) {
        List<Field> fields = new ArrayList<>(Arrays.asList(type.getDeclaredFields()));

        if (type.getSuperclass() != null) {
            fields.addAll(getAllFields(type.getSuperclass()));
        }
        return fields;
    }
}
