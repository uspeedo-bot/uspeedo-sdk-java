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

public class UpdateUSMSTemplateReq extends Request {

    
        
    /**
     * Properties corresponding to template variables
     */
    @USpeedoParam("VariableAttr")
    private String variableAttr;
        
    
        
    /**
     * Account ID,Get accountId reference: https://docs.uspeedo.com/docs/sms/api/
     */
    @USpeedoParam("AccountId")
    private Integer accountId;
        
    
        
    /**
     * 
     */
    @USpeedoParam("Instruction")
    private String instruction;
        
    
        
    /**
     * tags
     */
    @USpeedoParam("Tags")
    private List<Integer> tags;
        
    
        
    /**
     * 
     */
    @USpeedoParam("Template")
    private String template;
        
    
        
    /**
     * 
     */
    @NotEmpty
    @USpeedoParam("TemplateId")
    private String templateId;
        
    
        
    /**
     * 
     */
    @USpeedoParam("TemplateName")
    private String templateName;
        
    
    public String getVariableAttr() {
        return variableAttr;
    }

    public void setVariableAttr(String variableAttr) {
        this.variableAttr = variableAttr;
    }
    
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
    
    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }
    
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
    
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
    
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
}









