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
package com.uspeedo.mms.client;

import com.uspeedo.common.client.DefaultClient;
import com.uspeedo.common.config.Config;
import com.uspeedo.common.credential.Credential;
import com.uspeedo.common.exception.USpeedoException;
        
        
        
import com.uspeedo.mms.models.DeleteMMSTemplateReq;
import com.uspeedo.mms.models.DeleteMMSTemplateRes;
        
        
        
import com.uspeedo.mms.models.QueryMMSTemplateReq;
import com.uspeedo.mms.models.QueryMMSTemplateRes;
        
        
        
import com.uspeedo.mms.models.SendBatchMMSMessageReq;
import com.uspeedo.mms.models.SendBatchMMSMessageRes;
        
        
        
import com.uspeedo.mms.models.GetMMSSendReceiptReq;
import com.uspeedo.mms.models.GetMMSSendReceiptRes;
        
        
        
import com.uspeedo.mms.models.UpdateMMSTemplateReq;
import com.uspeedo.mms.models.UpdateMMSTemplateRes;
        
        
        
import com.uspeedo.mms.models.CreateMMSTemplateReq;
import com.uspeedo.mms.models.CreateMMSTemplateRes;

/**
 * This client is used to call actions of **MMS** service
 */
public class MMSClient extends DefaultClient implements MMSClientInterface {
    public MMSClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * DeleteMMSTemplate - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public DeleteMMSTemplateRes deleteMMSTemplate(DeleteMMSTemplateReq request) throws USpeedoException {
            request.setAction("DeleteMMSTemplate");
            return (DeleteMMSTemplateRes) this.invoke(request, DeleteMMSTemplateRes.class);
        }
        
        
        
        
        
        
        /**
         * QueryMMSTemplate - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public QueryMMSTemplateRes queryMMSTemplate(QueryMMSTemplateReq request) throws USpeedoException {
            request.setAction("QueryMMSTemplate");
            return (QueryMMSTemplateRes) this.invoke(request, QueryMMSTemplateRes.class);
        }
        
        
        
        
        
        
        /**
         * SendBatchMMSMessage - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public SendBatchMMSMessageRes sendBatchMMSMessage(SendBatchMMSMessageReq request) throws USpeedoException {
            request.setAction("SendBatchMMSMessage");
            return (SendBatchMMSMessageRes) this.invoke(request, SendBatchMMSMessageRes.class);
        }
        
        
        
        
        
        
        /**
         * GetMMSSendReceipt - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public GetMMSSendReceiptRes getMMSSendReceipt(GetMMSSendReceiptReq request) throws USpeedoException {
            request.setAction("GetMMSSendReceipt");
            return (GetMMSSendReceiptRes) this.invoke(request, GetMMSSendReceiptRes.class);
        }
        
        
        
        
        
        
        /**
         * UpdateMMSTemplate - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public UpdateMMSTemplateRes updateMMSTemplate(UpdateMMSTemplateReq request) throws USpeedoException {
            request.setAction("UpdateMMSTemplate");
            return (UpdateMMSTemplateRes) this.invoke(request, UpdateMMSTemplateRes.class);
        }
        
        
        
        
        
        
        /**
         * CreateMMSTemplate - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public CreateMMSTemplateRes createMMSTemplate(CreateMMSTemplateReq request) throws USpeedoException {
            request.setAction("CreateMMSTemplate");
            return (CreateMMSTemplateRes) this.invoke(request, CreateMMSTemplateRes.class);
        }
}
