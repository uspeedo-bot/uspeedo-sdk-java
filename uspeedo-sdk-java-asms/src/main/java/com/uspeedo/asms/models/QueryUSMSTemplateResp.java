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


import com.google.gson.annotations.SerializedName;

import com.uspeedo.common.response.Response;

public class QueryUSMSTemplateResp extends Response {

    
        
    /**
     * 
     */
    @SerializedName("Data")
    private List<OutTemplate> data;
        
    
    public List<OutTemplate> getData() {
        return data;
    }

    public void setData(List<OutTemplate> data) {
        this.data = data;
    }
    
        public static class OutTemplate extends Response {
            
        
    /**
     * 
     */
    @SerializedName("Status")
    private Integer status;
        
    
        
    /**
     * 
     */
    @SerializedName("TemplateId")
    private String templateId;
        
    
        
    /**
     * Properties corresponding to template variables
     */
    @SerializedName("Attributes")
    private List<VariableAttr> attributes;
        
    
        
    /**
     * 
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 
     */
    @SerializedName("Remark")
    private String remark;
        
    
        
    /**
     * tags
     */
    @SerializedName("Tags")
    private List<Integer> tags;
        
    
        
    /**
     * 
     */
    @SerializedName("Template")
    private String template;
        
    
        
    /**
     * 
     */
    @SerializedName("TemplateName")
    private String templateName;
        
    
        
    /**
     * 
     */
    @SerializedName("ErrDesc")
    private String errDesc;
        
    
        
    /**
     * 
     */
    @SerializedName("Instruction")
    private String instruction;
        
    
        
    /**
     * 
     */
    @SerializedName("Purpose")
    private Integer purpose;
        
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
    
    public List<VariableAttr> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<VariableAttr> attributes) {
        this.attributes = attributes;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
    
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }
    
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
    
    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }
    
        }
        public static class VariableAttr extends Response {
            
        
    /**
     * 模版参数对应的属性，如果没有属性，则为空
     */
    @SerializedName("Attribute")
    private String attribute;
        
    
        
    /**
     * 属性不存在的时候的默认值
     */
    @SerializedName("Default")
    private String fDefault;
        
    
        
    /**
     * 模版参数名称
     */
    @SerializedName("Variable")
    private String variable;
        
    
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    public String getDefault() {
        return fDefault;
    }

    public void setDefault(String fDefault) {
        this.fDefault = fDefault;
    }
    
    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
    
        }
}









