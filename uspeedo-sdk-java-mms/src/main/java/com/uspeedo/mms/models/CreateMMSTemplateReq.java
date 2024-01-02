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

public class CreateMMSTemplateReq extends Request {

    
        
    /**
     * media files, base64 encoded, less than 300kb
     */
    @NotEmpty
    @USpeedoParam("Media")
    private String media;
        
    
        
    /**
     * template name
     */
    @NotEmpty
    @USpeedoParam("TemplateName")
    private String templateName;
        
    
        
    /**
     * text content
     */
    @NotEmpty
    @USpeedoParam("Text")
    private String text;
        
    
        
    /**
     * Account ID,Get accountId reference: https://docs.uspeedo.com/docs/mms/api/
     */
    @NotEmpty
    @USpeedoParam("AccountId")
    private Integer accountId;
        
    
        
    /**
     * media file type
     */
    @NotEmpty
    @USpeedoParam("MediaType")
    private String mediaType;
        
    
        
    /**
     * subject
     */
    @USpeedoParam("Subject")
    private String subject;
        
    
    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
    
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
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
    
}









