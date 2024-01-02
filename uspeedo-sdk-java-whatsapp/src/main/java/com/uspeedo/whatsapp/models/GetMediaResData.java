/**
 * Copyright 2021 USpeedo Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.uspeedo.whatsapp.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import com.uspeedo.common.response.Response;

public class GetMediaResData extends Response {

    
        
    /**
     * 
     */
    @SerializedName("Data")
    private GetMediaRes data;
        
    
    public GetMediaRes getData() {
        return data;
    }

    public void setData(GetMediaRes data) {
        this.data = data;
    }
    
    public static class GetMediaRes extends Response {
        
        
    /**
     * 
     */
    @SerializedName("FileName")
    private String fileName;
        
    
        
    /**
     * 
     */
    @SerializedName("MimeType")
    private String mimeType;
        
    
        
    /**
     * 
     */
    @SerializedName("URL")
    private String url;
        
    
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    
    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }
    
    }
}









