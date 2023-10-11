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

public class Console__data_console_GetTemplatesResponse extends Response {

    
        
    /**
     * 
     */
    @SerializedName("Data")
    private Console__GetTemplatesResponse data;
        
    
    public Console__GetTemplatesResponse getData() {
        return data;
    }

    public void setData(Console__GetTemplatesResponse data) {
        this.data = data;
    }
    
        public static class Console__QualityScore extends Response {
            
        
    /**
     * 
     */
    @SerializedName("score")
    private String score;
        
    
    public String getscore() {
        return score;
    }

    public void setscore(String score) {
        this.score = score;
    }
    
        }
        public static class Console__GetTemplatesResponse extends Response {
            
        
    /**
     * 
     */
    @SerializedName("Paging")
    private Console__Paging paging;
        
    
        
    /**
     * 
     */
    @SerializedName("Data")
    private List<Console__TemplateInfo> data;
        
    
    public Console__Paging getPaging() {
        return paging;
    }

    public void setPaging(Console__Paging paging) {
        this.paging = paging;
    }
    
    public List<Console__TemplateInfo> getData() {
        return data;
    }

    public void setData(List<Console__TemplateInfo> data) {
        this.data = data;
    }
    
        }
        public static class Console__Cursors extends Response {
            
        
    /**
     * 
     */
    @SerializedName("before")
    private String before;
        
    
        
    /**
     * 
     */
    @SerializedName("after")
    private String after;
        
    
    public String getbefore() {
        return before;
    }

    public void setbefore(String before) {
        this.before = before;
    }
    
    public String getafter() {
        return after;
    }

    public void setafter(String after) {
        this.after = after;
    }
    
        }
        public static class Console__Component extends Response {
            
        
    /**
     * 
     */
    @SerializedName("Text")
    private String text;
        
    
        
    /**
     * 
     */
    @SerializedName("Type")
    private String type;
        
    
        
    /**
     * 
     */
    @SerializedName("Buttons")
    private List<Console__Button> buttons;
        
    
        
    /**
     * 
     */
    @SerializedName("Example")
    private Console__Example example;
        
    
        
    /**
     * 
     */
    @SerializedName("Format")
    private String format;
        
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public List<Console__Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Console__Button> buttons) {
        this.buttons = buttons;
    }
    
    public Console__Example getExample() {
        return example;
    }

    public void setExample(Console__Example example) {
        this.example = example;
    }
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    
        }
        public static class Console__Button extends Response {
            
        
    /**
     * 
     */
    @SerializedName("Example")
    private List<String> example;
        
    
        
    /**
     * 
     */
    @SerializedName("PhoneNumber")
    private String phoneNumber;
        
    
        
    /**
     * 
     */
    @SerializedName("Text")
    private String text;
        
    
        
    /**
     * 
     */
    @SerializedName("Type")
    private String type;
        
    
        
    /**
     * 
     */
    @SerializedName("URL")
    private String url;
        
    
    public List<String> getExample() {
        return example;
    }

    public void setExample(List<String> example) {
        this.example = example;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }
    
        }
        public static class Console__Example extends Response {
            
        
    /**
     * 
     */
    @SerializedName("HeaderText")
    private List<String> headerText;
        
    
        
    /**
     * 
     */
    @SerializedName("BodyText")
    private List<List<String>> bodyText;
        
    
        
    /**
     * 
     */
    @SerializedName("HeaderHandle")
    private List<String> headerHandle;
        
    
    public List<String> getHeaderText() {
        return headerText;
    }

    public void setHeaderText(List<String> headerText) {
        this.headerText = headerText;
    }
    
    public List<List<String>> getBodyText() {
        return bodyText;
    }

    public void setBodyText(List<List<String>> bodyText) {
        this.bodyText = bodyText;
    }
    
    public List<String> getHeaderHandle() {
        return headerHandle;
    }

    public void setHeaderHandle(List<String> headerHandle) {
        this.headerHandle = headerHandle;
    }
    
        }
        public static class Console__TemplateInfo extends Response {
            
        
    /**
     * 
     */
    @SerializedName("Status")
    private String status;
        
    
        
    /**
     * 
     */
    @SerializedName("Category")
    private String category;
        
    
        
    /**
     * 
     */
    @SerializedName("Language")
    private String language;
        
    
        
    /**
     * 
     */
    @SerializedName("RejectedReason")
    private String rejectedReason;
        
    
        
    /**
     * 
     */
    @SerializedName("QualityScore")
    private Console__QualityScore qualityScore;
        
    
        
    /**
     * 
     */
    @SerializedName("Tags")
    private List<String> tags;
        
    
        
    /**
     * 
     */
    @SerializedName("Components")
    private List<Console__Component> components;
        
    
        
    /**
     * 
     */
    @SerializedName("ID")
    private String id;
        
    
        
    /**
     * 
     */
    @SerializedName("Name")
    private String name;
        
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String getRejectedReason() {
        return rejectedReason;
    }

    public void setRejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
    }
    
    public Console__QualityScore getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Console__QualityScore qualityScore) {
        this.qualityScore = qualityScore;
    }
    
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    
    public List<Console__Component> getComponents() {
        return components;
    }

    public void setComponents(List<Console__Component> components) {
        this.components = components;
    }
    
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        }
        public static class Console__Paging extends Response {
            
        
    /**
     * 
     */
    @SerializedName("cursors")
    private Console__Cursors cursors;
        
    
        
    /**
     * 
     */
    @SerializedName("next")
    private String next;
        
    
        
    /**
     * 
     */
    @SerializedName("previous")
    private String previous;
        
    
    public Console__Cursors getcursors() {
        return cursors;
    }

    public void setcursors(Console__Cursors cursors) {
        this.cursors = cursors;
    }
    
    public String getnext() {
        return next;
    }

    public void setnext(String next) {
        this.next = next;
    }
    
    public String getprevious() {
        return previous;
    }

    public void setprevious(String previous) {
        this.previous = previous;
    }
    
        }
}









