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
package com.uspeedo.vms.client;

import com.uspeedo.common.client.DefaultClient;
import com.uspeedo.common.config.Config;
import com.uspeedo.common.credential.Credential;
import com.uspeedo.common.exception.USpeedoException;
        
        
        
import com.uspeedo.vms.models.SendMessageRequest;
import com.uspeedo.vms.models.SendMessageResponse;

/**
 * This client is used to call actions of **VMS** service
 */
public class VMSClient extends DefaultClient implements VMSClientInterface {
    public VMSClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * SendVMSMessage - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public SendMessageResponse sendVMSMessage(SendMessageRequest request) throws USpeedoException {
            request.setAction("SendVMSMessage");
            return (SendMessageResponse) this.invoke(request, SendMessageResponse.class);
        }
}
