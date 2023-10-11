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

import com.uspeedo.common.client.DefaultClient;
import com.uspeedo.common.config.Config;
import com.uspeedo.common.credential.Credential;
import com.uspeedo.common.exception.USpeedoException;
        
        
        
import com.uspeedo.email.models.Action__sendEmailTemplateReq;
import com.uspeedo.email.models.Action__SendEmailTemplateResponse;

/**
 * This client is used to call actions of **Email** service
 */
public class EmailClient extends DefaultClient implements EmailClientInterface {
    public EmailClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * SendEmailTemplate - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public Action__SendEmailTemplateResponse sendEmailTemplate(Action__sendEmailTemplateReq request) throws USpeedoException {
            request.setAction("SendEmailTemplate");
            return (Action__SendEmailTemplateResponse) this.invoke(request, Action__SendEmailTemplateResponse.class);
        }
}
