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


import com.uspeedo.common.request.Request;
import com.uspeedo.common.annotation.NotEmpty;
import com.uspeedo.common.annotation.USpeedoParam;

public class UpdateMMSTemplateReq extends Request {

    
        
    /**
     * Account ID,Get accountId reference: https://docs.uspeedo.com/docs/mms/api/
     */
    @NotEmpty
    @USpeedoParam("AccountId")
    private Integer accountId;
        
    
        
    /**
     * media file types
     */
    @USpeedoParam("MediaType")
    private String mediaType;
        
    
        
    /**
     * subject
     */
    @USpeedoParam("Subject")
    private String subject;
        
    
        
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
        
    
        
    /**
     * media files, base64 encoded
     */
    @USpeedoParam("Media")
    private String media;
        
    
        
    /**
     * tags
     */
    @USpeedoParam("Tags")
    private List<Integer> tags;
        
    
        
    /**
     * 
     */
    @USpeedoParam("Text")
    private String text;
        
    
        
    /**
     * properties corresponding to template variables
     */
    @USpeedoParam("VariableAttr")
    private String variableAttr;
        
    
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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
    
    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
    
    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getVariableAttr() {
        return variableAttr;
    }

    public void setVariableAttr(String variableAttr) {
        this.variableAttr = variableAttr;
    }
    
}









