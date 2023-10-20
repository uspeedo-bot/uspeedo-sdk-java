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

public class GetMessageSummaryResData extends Response {

    
        
    /**
     * 
     */
    @SerializedName("Data")
    private GetMessageSummaryRes data;
        
    
    public GetMessageSummaryRes getData() {
        return data;
    }

    public void setData(GetMessageSummaryRes data) {
        this.data = data;
    }
    
        public static class GetMessageSummaryRes extends Response {
            
        
    /**
     * total amount of messages
     */
    @SerializedName("MsgAmount")
    private Integer msgAmount;
        
    
        
    /**
     * detailed message statistics
     */
    @SerializedName("MsgList")
    private List<MessageSummary> msgList;
        
    
        
    /**
     * total number of messages
     */
    @SerializedName("MsgNum")
    private Integer msgNum;
        
    
    public Integer getMsgAmount() {
        return msgAmount;
    }

    public void setMsgAmount(Integer msgAmount) {
        this.msgAmount = msgAmount;
    }
    
    public List<MessageSummary> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<MessageSummary> msgList) {
        this.msgList = msgList;
    }
    
    public Integer getMsgNum() {
        return msgNum;
    }

    public void setMsgNum(Integer msgNum) {
        this.msgNum = msgNum;
    }
    
        }
        public static class MessageSummary extends Response {
            
        
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









