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

public class Console__data_console_getAccountAppKeyResponse extends Response {

    
        
    /**
     * 
     */
    @SerializedName("Data")
    private Console__getAccountAppKeyResponse data;
        
    
    public Console__getAccountAppKeyResponse getData() {
        return data;
    }

    public void setData(Console__getAccountAppKeyResponse data) {
        this.data = data;
    }
    
        public static class Console__getAccountAppKeyResponse extends Response {
            
        
    /**
     * 
     */
    @SerializedName("PhoneList")
    private List<Console__getAccountPhoneListResponseItem> phoneList;
        
    
    public List<Console__getAccountPhoneListResponseItem> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Console__getAccountPhoneListResponseItem> phoneList) {
        this.phoneList = phoneList;
    }
    
        }
        public static class Console__getAccountPhoneListResponseItem extends Response {
            
        
    /**
     * 
     */
    @SerializedName("MessagingLimit")
    private String messagingLimit;
        
    
        
    /**
     * 
     */
    @SerializedName("Number")
    private String number;
        
    
        
    /**
     * 
     */
    @SerializedName("QualityRating")
    private String qualityRating;
        
    
        
    /**
     * 
     */
    @SerializedName("Status")
    private String status;
        
    
        
    /**
     * 
     */
    @SerializedName("Country")
    private String country;
        
    
        
    /**
     * 
     */
    @SerializedName("DisplayName")
    private String displayName;
        
    
    public String getMessagingLimit() {
        return messagingLimit;
    }

    public void setMessagingLimit(String messagingLimit) {
        this.messagingLimit = messagingLimit;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getQualityRating() {
        return qualityRating;
    }

    public void setQualityRating(String qualityRating) {
        this.qualityRating = qualityRating;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
        }
}









