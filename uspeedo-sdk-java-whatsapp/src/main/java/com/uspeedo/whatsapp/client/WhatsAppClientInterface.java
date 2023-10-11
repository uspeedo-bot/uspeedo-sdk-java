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
        
        
        
import com.uspeedo.whatsapp.models.Client__GetMessageSummaryRequest;
import com.uspeedo.whatsapp.models.Console__data_console_GetMessageSummaryResponse;
        
        
        
import com.uspeedo.whatsapp.models.Console__getTemplateRequest;
import com.uspeedo.whatsapp.models.Console__data_console_GetTemplatesResponse;
        
        
        
import com.uspeedo.whatsapp.models.Console__sendMessageRequest;
import com.uspeedo.whatsapp.models.Console__data_console_sendMessageResponse;
        
        
        
import com.uspeedo.whatsapp.models.Console__uploadMediaRequest;
import com.uspeedo.whatsapp.models.Console__data_console_uploadMediaResponse;
        
        
        
import com.uspeedo.whatsapp.models.Console__deleteMediaRequest;
import com.uspeedo.whatsapp.models.Common__Empty;
        
        
        
import com.uspeedo.whatsapp.models.Console__deleteTemplateRequest;
import com.uspeedo.whatsapp.models.Common__Empty;
        
        
        
import com.uspeedo.whatsapp.models.GetAccountPhoneListRequest;
import com.uspeedo.whatsapp.models.Console__data_console_getAccountAppKeyResponse;
        
        
        
import com.uspeedo.whatsapp.models.Console__getMediaRequest;
import com.uspeedo.whatsapp.models.Console__data_console_getMediaResponse;

/**
 * This client is used to call actions of **WhatsApp** service
 */
public interface WhatsAppClientInterface extends Client {
        
        
        
        
        
        
    /**
     * GetMessageSummary - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Console__data_console_GetMessageSummaryResponse getMessageSummary(Client__GetMessageSummaryRequest request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * GetTemplates - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Console__data_console_GetTemplatesResponse getTemplates(Console__getTemplateRequest request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * SendWhatsappMessage - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Console__data_console_sendMessageResponse sendWhatsappMessage(Console__sendMessageRequest request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * UploadMedia - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Console__data_console_uploadMediaResponse uploadMedia(Console__uploadMediaRequest request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * DeleteMedia - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Common__Empty deleteMedia(Console__deleteMediaRequest request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * DeleteTemplate - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Common__Empty deleteTemplate(Console__deleteTemplateRequest request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * GetAccountPhoneList - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Console__data_console_getAccountAppKeyResponse getAccountPhoneList(GetAccountPhoneListRequest request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * GetMedia - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public Console__data_console_getMediaResponse getMedia(Console__getMediaRequest request) throws USpeedoException;
}
