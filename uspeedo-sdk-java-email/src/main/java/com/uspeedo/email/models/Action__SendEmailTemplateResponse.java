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

package com.uspeedo.email.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import com.uspeedo.common.response.Response;

public class Action__SendEmailTemplateResponse extends Response {

    
        
    /**
     * 
     */
    @SerializedName("FailContent")
    private List<Action__FailedTargetEmail> failContent;
        
    
        
    /**
     * The unique identifier of this sending task
     */
    @SerializedName("SessionNo")
    private String sessionNo;
        
    
        
    /**
     * 
     */
    @SerializedName("SuccessCount")
    private Integer successCount;
        
    
    public List<Action__FailedTargetEmail> getFailContent() {
        return failContent;
    }

    public void setFailContent(List<Action__FailedTargetEmail> failContent) {
        this.failContent = failContent;
    }
    
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
    
        public static class Action__FailedTargetEmail extends Response {
            
        
    /**
     * variableName{##}variableValue
     */
    @SerializedName("TemplateVariableParams")
    private List<String> templateVariableParams;
        
    
        
    /**
     * 
     */
    @SerializedName("EmailAddress")
    private String emailAddress;
        
    
        
    /**
     * 
     */
    @SerializedName("FailureReason")
    private String failureReason;
        
    
    public List<String> getTemplateVariableParams() {
        return templateVariableParams;
    }

    public void setTemplateVariableParams(List<String> templateVariableParams) {
        this.templateVariableParams = templateVariableParams;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }
    
        }
}









