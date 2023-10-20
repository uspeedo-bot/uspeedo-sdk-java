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

public class SendWhatsappMessageReq extends Request {

    
        
    /**
     * message type
     */
    @NotEmpty
    @USpeedoParam("Type")
    private String type;
        
    
        
    /**
     * send phone number
     */
    @NotEmpty
    @USpeedoParam("BusinessPhone")
    private String businessPhone;
        
    
        
    /**
     * message content in json
     */
    @NotEmpty
    @USpeedoParam("Content")
    private String content;
        
    
        
    /**
     * target phone number
     */
    @NotEmpty
    @USpeedoParam("To")
    private String to;
        
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    
}









