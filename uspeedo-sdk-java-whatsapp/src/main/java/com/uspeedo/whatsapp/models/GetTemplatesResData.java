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

public class GetTemplatesResData extends Response {

    
        
    /**
     * 
     */
    @SerializedName("Data")
    private GetTemplatesRes data;
        
    
    public GetTemplatesRes getData() {
        return data;
    }

    public void setData(GetTemplatesRes data) {
        this.data = data;
    }
    
    public static class TemplateAttribute extends Response {
        
        
    /**
     * named variable map with 1、2
     */
    @SerializedName("NamedVar")
    private List<String> namedVar;
        
    
        
    /**
     * component item type
     */
    @SerializedName("Type")
    private String type;
        
    
    public List<String> getNamedVar() {
        return namedVar;
    }

    public void setNamedVar(List<String> namedVar) {
        this.namedVar = namedVar;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    }
    public static class GetTemplatesRes extends Response {
        
        
    /**
     * 
     */
    @SerializedName("Data")
    private List<TemplateInfo> data;
        
    
        
    /**
     * 
     */
    @SerializedName("Paging")
    private GetTemplatesPaging paging;
        
    
    public List<TemplateInfo> getData() {
        return data;
    }

    public void setData(List<TemplateInfo> data) {
        this.data = data;
    }
    
    public GetTemplatesPaging getPaging() {
        return paging;
    }

    public void setPaging(GetTemplatesPaging paging) {
        this.paging = paging;
    }
    
    }
    public static class TemplateComponentButton extends Response {
        
        
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
        
    
        
    /**
     * 
     */
    @SerializedName("Example")
    private List<String> example;
        
    
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
    
    public List<String> getExample() {
        return example;
    }

    public void setExample(List<String> example) {
        this.example = example;
    }
    
    }
    public static class TemplateComponent extends Response {
        
        
    /**
     * 
     */
    @SerializedName("Example")
    private TemplateComponentExample example;
        
    
        
    /**
     * 
     */
    @SerializedName("Format")
    private String format;
        
    
        
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
    private List<TemplateComponentButton> buttons;
        
    
    public TemplateComponentExample getExample() {
        return example;
    }

    public void setExample(TemplateComponentExample example) {
        this.example = example;
    }
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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
    
    public List<TemplateComponentButton> getButtons() {
        return buttons;
    }

    public void setButtons(List<TemplateComponentButton> buttons) {
        this.buttons = buttons;
    }
    
    }
    public static class GetTemplatesPaging extends Response {
        
        
    /**
     * 
     */
    @SerializedName("Cursors")
    private GetTemplatesCursors cursors;
        
    
        
    /**
     * 
     */
    @SerializedName("Next")
    private String next;
        
    
        
    /**
     * 
     */
    @SerializedName("Previous")
    private String previous;
        
    
    public GetTemplatesCursors getCursors() {
        return cursors;
    }

    public void setCursors(GetTemplatesCursors cursors) {
        this.cursors = cursors;
    }
    
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
    
    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }
    
    }
    public static class TemplateInfo extends Response {
        
        
    /**
     * 
     */
    @SerializedName("Category")
    private String category;
        
    
        
    /**
     * 
     */
    @SerializedName("ID")
    private String id;
        
    
        
    /**
     * 
     */
    @SerializedName("QualityScore")
    private TemplateQualityScore qualityScore;
        
    
        
    /**
     * 
     */
    @SerializedName("Status")
    private String status;
        
    
        
    /**
     * 
     */
    @SerializedName("Tags")
    private List<String> tags;
        
    
        
    /**
     * 
     */
    @SerializedName("Attributes")
    private List<TemplateAttribute> attributes;
        
    
        
    /**
     * 
     */
    @SerializedName("Components")
    private List<TemplateComponent> components;
        
    
        
    /**
     * 
     */
    @SerializedName("Language")
    private String language;
        
    
        
    /**
     * 
     */
    @SerializedName("Name")
    private String name;
        
    
        
    /**
     * 
     */
    @SerializedName("RejectedReason")
    private String rejectedReason;
        
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }
    
    public TemplateQualityScore getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(TemplateQualityScore qualityScore) {
        this.qualityScore = qualityScore;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    
    public List<TemplateAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<TemplateAttribute> attributes) {
        this.attributes = attributes;
    }
    
    public List<TemplateComponent> getComponents() {
        return components;
    }

    public void setComponents(List<TemplateComponent> components) {
        this.components = components;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getRejectedReason() {
        return rejectedReason;
    }

    public void setRejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
    }
    
    }
    public static class TemplateComponentExample extends Response {
        
        
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
        
    
        
    /**
     * 
     */
    @SerializedName("HeaderText")
    private List<String> headerText;
        
    
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
    
    public List<String> getHeaderText() {
        return headerText;
    }

    public void setHeaderText(List<String> headerText) {
        this.headerText = headerText;
    }
    
    }
    public static class GetTemplatesCursors extends Response {
        
        
    /**
     * 
     */
    @SerializedName("After")
    private String after;
        
    
        
    /**
     * 
     */
    @SerializedName("Before")
    private String before;
        
    
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }
    
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }
    
    }
    public static class TemplateQualityScore extends Response {
        
        
    /**
     * 
     */
    @SerializedName("Score")
    private String score;
        
    
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
    }
}









