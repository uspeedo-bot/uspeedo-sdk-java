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

public class Console__data_console_GetMessageSummaryResponse extends Response {

    
        
    /**
     * 
     */
    @SerializedName("Data")
    private Console__GetMessageSummaryResponse data;
        
    
    public Console__GetMessageSummaryResponse getData() {
        return data;
    }

    public void setData(Console__GetMessageSummaryResponse data) {
        this.data = data;
    }
    
        public static class Console__GetMessageSummaryResponse extends Response {
            
        
    /**
     * detailed message statistics
     */
    @SerializedName("MsgList")
    private List<Client__MessageSummary> msgList;
        
    
        
    /**
     * total number of messages
     */
    @SerializedName("MsgNum")
    private Integer msgNum;
        
    
        
    /**
     * total amount of messages
     */
    @SerializedName("MsgAmount")
    private Integer msgAmount;
        
    
    public List<Client__MessageSummary> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<Client__MessageSummary> msgList) {
        this.msgList = msgList;
    }
    
    public Integer getMsgNum() {
        return msgNum;
    }

    public void setMsgNum(Integer msgNum) {
        this.msgNum = msgNum;
    }
    
    public Integer getMsgAmount() {
        return msgAmount;
    }

    public void setMsgAmount(Integer msgAmount) {
        this.msgAmount = msgAmount;
    }
    
        }
        public static class Client__MessageSummary extends Response {
            
        
    /**
     * 
     */
    @SerializedName("BusinessPhone")
    private String businessPhone;
        
    
        
    /**
     * 
     */
    @SerializedName("ConvAmount")
    private Integer convAmount;
        
    
        
    /**
     * 
     */
    @SerializedName("ConvNum")
    private Integer convNum;
        
    
        
    /**
     * 
     */
    @SerializedName("Country")
    private String country;
        
    
    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }
    
    public Integer getConvAmount() {
        return convAmount;
    }

    public void setConvAmount(Integer convAmount) {
        this.convAmount = convAmount;
    }
    
    public Integer getConvNum() {
        return convNum;
    }

    public void setConvNum(Integer convNum) {
        this.convNum = convNum;
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
        }
}









