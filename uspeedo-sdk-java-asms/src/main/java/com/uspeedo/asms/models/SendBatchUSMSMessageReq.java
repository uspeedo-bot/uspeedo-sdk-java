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

package com.uspeedo.asms.models;

import java.util.List;


import com.uspeedo.common.request.Request;
import com.uspeedo.common.annotation.NotEmpty;
import com.uspeedo.common.annotation.USpeedoParam;

public class SendBatchUSMSMessageReq extends Request {

    
        
    /**
     * Account ID,Get accountId reference: https://docs.uspeedo.com/docs/sms/api/
     */
    @USpeedoParam("AccountId")
    private Integer accountId;
        
    
        
    /**
     * 
     */
    @NotEmpty
    @USpeedoParam("TaskContent")
    private List<SendInfo> taskContent;
        
    
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    
    public List<SendInfo> getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(List<SendInfo> taskContent) {
        this.taskContent = taskContent;
    }
    
    public static class SendInfo extends Request {
        
        
    /**
     * Sender Name is basically used to identify the sender of the bulk SMS message.
     */
    @USpeedoParam("SenderId")
    private String senderId;
        
    
        
    /**
     * 
     */
    @USpeedoParam("Target")
    private List<TargetPhone> target;
        
    
        
    /**
     * Template ID
     */
    @USpeedoParam("TemplateId")
    private String templateId;
        
    
    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
    
    public List<TargetPhone> getTarget() {
        return target;
    }

    public void setTarget(List<TargetPhone> target) {
        this.target = target;
    }
    
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
    
    }
    public static class TargetPhone extends Request {
        
        
    /**
     * 
     */
    @USpeedoParam("Phone")
    private String phone;
        
    
        
    /**
     * 
     */
    @USpeedoParam("TemplateParams")
    private List<String> templateParams;
        
    
        
    /**
     * 
     */
    @USpeedoParam("UserId")
    private String userId;
        
    
        
    /**
     * 
     */
    @USpeedoParam("ExtendCode")
    private String extendCode;
        
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public List<String> getTemplateParams() {
        return templateParams;
    }

    public void setTemplateParams(List<String> templateParams) {
        this.templateParams = templateParams;
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getExtendCode() {
        return extendCode;
    }

    public void setExtendCode(String extendCode) {
        this.extendCode = extendCode;
    }
    
    }
}









