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

import com.uspeedo.common.client.Client;
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
public interface MMSClientInterface extends Client {
        
        
        
        
        
        
    /**
     * DeleteMMSTemplate - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public DeleteMMSTemplateRes deleteMMSTemplate(DeleteMMSTemplateReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * QueryMMSTemplate - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public QueryMMSTemplateRes queryMMSTemplate(QueryMMSTemplateReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * SendBatchMMSMessage - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public SendBatchMMSMessageRes sendBatchMMSMessage(SendBatchMMSMessageReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * GetMMSSendReceipt - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public GetMMSSendReceiptRes getMMSSendReceipt(GetMMSSendReceiptReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * UpdateMMSTemplate - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public UpdateMMSTemplateRes updateMMSTemplate(UpdateMMSTemplateReq request) throws USpeedoException;
        
        
        
        
        
        
    /**
     * CreateMMSTemplate - 
     *
     * @param request Request object
     * @throws USpeedoException Exception
     */
    public CreateMMSTemplateRes createMMSTemplate(CreateMMSTemplateReq request) throws USpeedoException;
}
