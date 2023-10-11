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


import com.uspeedo.common.request.Request;
import com.uspeedo.common.annotation.NotEmpty;
import com.uspeedo.common.annotation.USpeedoParam;

public class Console__getTemplateRequest extends Request {

    
        
    /**
     * 
     */
    @USpeedoParam("After")
    private String after;
        
    
        
    /**
     * 
     */
    @USpeedoParam("Before")
    private String before;
        
    
        
    /**
     * 
     */
    @NotEmpty
    @USpeedoParam("BusinessPhone")
    private String businessPhone;
        
    
        
    /**
     * 
     */
    @USpeedoParam("Limit")
    private Integer limit;
        
    
        
    /**
     * 
     */
    @USpeedoParam("Name")
    private String name;
        
    
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
    
    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }
    
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}









