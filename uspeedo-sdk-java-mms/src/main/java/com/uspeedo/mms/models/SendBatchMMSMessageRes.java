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

package com.uspeedo.mms.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import com.uspeedo.common.response.Response;

public class SendBatchMMSMessageRes extends Response {

    
        
    /**
     * 
     */
    @SerializedName("SessionNo")
    private String sessionNo;
        
    
        
    /**
     * 
     */
    @SerializedName("SuccessCount")
    private Integer successCount;
        
    
        
    /**
     * 
     */
    @SerializedName("FailContent")
    private List<SendInfoWithFailure> failContent;
        
    
    public String getSessionNo() {
        return sessionNo;
    }

    public void setSessionNo(String sessionNo) {
        this.sessionNo = sessionNo;
    }
    
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }
    
    public List<SendInfoWithFailure> getFailContent() {
        return failContent;
    }

    public void setFailContent(List<SendInfoWithFailure> failContent) {
        this.failContent = failContent;
    }
    
    public static class SendInfoWithFailure extends Response {
        
        
    /**
     * 
     */
    @SerializedName("FailureDetails")
    private String failureDetails;
        
    
        
    /**
     * Sender Name is basically used to identify the sender of the bulk SMS message.
     */
    @SerializedName("SenderId")
    private String senderId;
        
    
        
    /**
     * 
     */
    @SerializedName("Target")
    private List<TargetPhoneWithFailure> target;
        
    
        
    /**
     * Template ID
     */
    @SerializedName("TemplateId")
    private String templateId;
        
    
    public String getFailureDetails() {
        return failureDetails;
    }

    public void setFailureDetails(String failureDetails) {
        this.failureDetails = failureDetails;
    }
    
    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
    
    public List<TargetPhoneWithFailure> getTarget() {
        return target;
    }

    public void setTarget(List<TargetPhoneWithFailure> target) {
        this.target = target;
    }
    
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
    
    }
    public static class TargetPhoneWithFailure extends Response {
        
        
    /**
     * 
     */
    @SerializedName("TemplateParams")
    private List<String> templateParams;
        
    
        
    /**
     * 
     */
    @SerializedName("FailureDetails")
    private String failureDetails;
        
    
        
    /**
     * 
     */
    @SerializedName("Invalid")
    private Boolean invalid;
        
    
        
    /**
     * 
     */
    @SerializedName("Phone")
    private String phone;
        
    
    public List<String> getTemplateParams() {
        return templateParams;
    }

    public void setTemplateParams(List<String> templateParams) {
        this.templateParams = templateParams;
    }
    
    public String getFailureDetails() {
        return failureDetails;
    }

    public void setFailureDetails(String failureDetails) {
        this.failureDetails = failureDetails;
    }
    
    public Boolean getInvalid() {
        return invalid;
    }

    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    }
}









