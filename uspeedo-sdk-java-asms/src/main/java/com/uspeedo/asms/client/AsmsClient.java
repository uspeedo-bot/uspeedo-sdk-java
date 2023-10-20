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
package com.uspeedo.asms.client;

import com.uspeedo.common.client.DefaultClient;
import com.uspeedo.common.config.Config;
import com.uspeedo.common.credential.Credential;
import com.uspeedo.common.exception.USpeedoException;
        
        
        
import com.uspeedo.asms.models.UpdateUSMSTemplateReq;
import com.uspeedo.asms.models.UpdateUSMSTemplateResp;
        
        
        
import com.uspeedo.asms.models.GetUSMSSendReceiptReq;
import com.uspeedo.asms.models.GetUSMSSendReceiptResp;
        
        
        
import com.uspeedo.asms.models.SendBatchUSMSMessageReq;
import com.uspeedo.asms.models.SendBatchUSMSMessageResp;
        
        
        
import com.uspeedo.asms.models.QueryUSMSTemplateReq;
import com.uspeedo.asms.models.QueryUSMSTemplateResp;
        
        
        
import com.uspeedo.asms.models.CreateUSMSTemplateReq;
import com.uspeedo.asms.models.ApplyUSMSTemplateResp;
        
        
        
import com.uspeedo.asms.models.DeleteUSMSTemplateReq;
import com.uspeedo.asms.models.DeleteUSMSTemplateResp;

/**
 * This client is used to call actions of **Asms** service
 */
public class AsmsClient extends DefaultClient implements AsmsClientInterface {
    public AsmsClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * UpdateUSMSTemplate - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public UpdateUSMSTemplateResp updateUSMSTemplate(UpdateUSMSTemplateReq request) throws USpeedoException {
            request.setAction("UpdateUSMSTemplate");
            return (UpdateUSMSTemplateResp) this.invoke(request, UpdateUSMSTemplateResp.class);
        }
        
        
        
        
        
        
        /**
         * GetUSMSSendReceipt - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public GetUSMSSendReceiptResp getUSMSSendReceipt(GetUSMSSendReceiptReq request) throws USpeedoException {
            request.setAction("GetUSMSSendReceipt");
            return (GetUSMSSendReceiptResp) this.invoke(request, GetUSMSSendReceiptResp.class);
        }
        
        
        
        
        
        
        /**
         * SendBatchUSMSMessage - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public SendBatchUSMSMessageResp sendBatchUSMSMessage(SendBatchUSMSMessageReq request) throws USpeedoException {
            request.setAction("SendBatchUSMSMessage");
            return (SendBatchUSMSMessageResp) this.invoke(request, SendBatchUSMSMessageResp.class);
        }
        
        
        
        
        
        
        /**
         * QueryUSMSTemplate - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public QueryUSMSTemplateResp queryUSMSTemplate(QueryUSMSTemplateReq request) throws USpeedoException {
            request.setAction("QueryUSMSTemplate");
            return (QueryUSMSTemplateResp) this.invoke(request, QueryUSMSTemplateResp.class);
        }
        
        
        
        
        
        
        /**
         * CreateUSMSTemplate - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public ApplyUSMSTemplateResp createUSMSTemplate(CreateUSMSTemplateReq request) throws USpeedoException {
            request.setAction("CreateUSMSTemplate");
            return (ApplyUSMSTemplateResp) this.invoke(request, ApplyUSMSTemplateResp.class);
        }
        
        
        
        
        
        
        /**
         * DeleteUSMSTemplate - 
         *
         * @param request Request object
         * @throws USpeedoException Exception
         */
        public DeleteUSMSTemplateResp deleteUSMSTemplate(DeleteUSMSTemplateReq request) throws USpeedoException {
            request.setAction("DeleteUSMSTemplate");
            return (DeleteUSMSTemplateResp) this.invoke(request, DeleteUSMSTemplateResp.class);
        }
}
