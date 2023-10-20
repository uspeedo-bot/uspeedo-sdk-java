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
package com.uspeedo.whatsapp.client;

import com.uspeedo.common.client.Client;
import com.uspeedo.common.exception.USpeedoException;
        
        
        
import com.uspeedo.whatsapp.models.GetMediaReq;
import com.uspeedo.whatsapp.models.GetMediaResData;
        
        
        
import com.uspeedo.whatsapp.models.GetMessageSummaryReq;
import com.uspeedo.whatsapp.models.GetMessageSummaryResData;
        
        
        
import com.uspeedo.whatsapp.models.GetTemplatesReq;
import com.uspeedo.whatsapp.models.GetTemplatesResData;
        
        
        
import com.uspeedo.whatsapp.models.SendWhatsappMessageReq;
import com.uspeedo.whatsapp.models.SendWhatsappMessageResData;
        
        
        
import com.uspeedo.whatsapp.models.UploadMediaReq;
import com.uspeedo.whatsapp.models.UploadMediaResData;
        
        
        
import com.uspeedo.whatsapp.models.DeleteMediaReq;
import com.uspeedo.whatsapp.models.Empty;
        
        
        
import com.uspeedo.whatsapp.models.DeleteTemplateReq;
import com.uspeedo.whatsapp.models.Empty;
        
        
        
import com.uspeedo.whatsapp.models.GetAccountPhoneListRequest;
import com.uspeedo.whatsapp.models.GetAccountPhoneListResData;

/**
 * This client is used to call actions of **WhatsApp** service
 */
public interface WhatsAppClientInterface extends Client {
        
        
        
        
        
        
    /**
     * GetMedia - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public GetMediaResData getMedia(GetMediaReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * GetMessageSummary - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public GetMessageSummaryResData getMessageSummary(GetMessageSummaryReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * GetTemplates - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public GetTemplatesResData getTemplates(GetTemplatesReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * SendWhatsappMessage - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public SendWhatsappMessageResData sendWhatsappMessage(SendWhatsappMessageReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * UploadMedia - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public UploadMediaResData uploadMedia(UploadMediaReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * DeleteMedia - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Empty deleteMedia(DeleteMediaReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * DeleteTemplate - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Empty deleteTemplate(DeleteTemplateReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * GetAccountPhoneList - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public GetAccountPhoneListResData getAccountPhoneList(GetAccountPhoneListRequest request) throws USpeedoException;
}
