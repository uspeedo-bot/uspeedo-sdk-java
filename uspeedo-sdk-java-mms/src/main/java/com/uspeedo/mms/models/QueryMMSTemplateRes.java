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

public class QueryMMSTemplateRes extends Response {

    
        
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
    @SerializedName("TemplateId")
    private String templateId;
        
    
        
    /**
     * text content
     */
    @SerializedName("Text")
    private String text;
        
    
        
    /**
     * properties corresponding to template variables
     */
    @SerializedName("Attributes")
    private List<VariableAttr> attributes;
        
    
        
    /**
     * 
     */
    @SerializedName("ErrDesc")
    private String errDesc;
        
    
        
    /**
     * media file address, base64 encoding, 3-second validity period
     */
    @SerializedName("MediaFile")
    private String mediaFile;
        
    
        
    /**
     * 
     */
    @SerializedName("Status")
    private Integer status;
        
    
        
    /**
     * 
     */
    @SerializedName("TemplateName")
    private String templateName;
        
    
        
    /**
     * 
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * media file type
     */
    @SerializedName("MediaType")
    private String mediaType;
        
    
        
    /**
     * subject
     */
    @SerializedName("Subject")
    private String subject;
        
    
        
    /**
     * tags
     */
    @SerializedName("Tags")
    private List<Integer> tags;
        
    
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public List<VariableAttr> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<VariableAttr> attributes) {
        this.attributes = attributes;
    }
    
    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }
    
    public String getMediaFile() {
        return mediaFile;
    }

    public void setMediaFile(String mediaFile) {
        this.mediaFile = mediaFile;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }
    
    }
    public static class VariableAttr extends Response {
        
        
    /**
     * default value when attribute does not exist
     */
    @SerializedName("Default")
    private String fDefault;
        
    
        
    /**
     * template parameter name
     */
    @SerializedName("Variable")
    private String variable;
        
    
        
    /**
     * the attribute corresponding to the template parameter, if there is no attribute, it is empty
     */
    @SerializedName("Attribute")
    private String attribute;
        
    
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
    
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    }
}









