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

public class CreateUSMSTemplateReq extends Request {

    
        
    /**
     * 
     */
    @NotEmpty
    @USpeedoParam("TemplateName")
    private String templateName;
        
    
        
    /**
     * Verification code: 1 , Notify : 2, sale : 3
     */
    @NotEmpty
    @USpeedoParam("Purpose")
    private Integer purpose;
        
    
        
    /**
     * 
     */
    @NotEmpty
    @USpeedoParam("Template")
    private String template;
        
    
        
    /**
     * Account ID,Get accountId reference: https://docs.uspeedo.com/docs/sms/api/
     */
    @USpeedoParam("AccountId")
    private Integer accountId;
        
    
        
    /**
     * 
     */
    @USpeedoParam("Remark")
    private String remark;
        
    
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }
    
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
    
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
}









