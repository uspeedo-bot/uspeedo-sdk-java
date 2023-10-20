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
package com.uspeedo.email.client;

import com.uspeedo.common.client.Client;
import com.uspeedo.common.exception.USpeedoException;
        
        
        
import com.uspeedo.email.models.SendEmailTemplateReq;
import com.uspeedo.email.models.SendEmailTemplateRes;

/**
 * This client is used to call actions of **Email** service
 */
public interface EmailClientInterface extends Client {
        
        
        
        
        
        
    /**
     * SendEmailTemplate - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public SendEmailTemplateRes sendEmailTemplate(SendEmailTemplateReq request) throws USpeedoException;
}
