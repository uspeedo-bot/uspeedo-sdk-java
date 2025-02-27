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

public class SendWhatsappMessageResData extends Response {

    
        
    /**
     * 
     */
    @SerializedName("Data")
    private SendWhatsappMessageRes data;
        
    
    public SendWhatsappMessageRes getData() {
        return data;
    }

    public void setData(SendWhatsappMessageRes data) {
        this.data = data;
    }
    
        public static class SendWhatsappMessageRes extends Response {
            
        
    /**
     * 
     */
    @SerializedName("MessageId")
    private String messageId;
        
    
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
        }
}









