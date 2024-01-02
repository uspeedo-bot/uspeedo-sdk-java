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

package com.uspeedo.mms.models;

import java.util.List;


import com.uspeedo.common.request.Request;
import com.uspeedo.common.annotation.NotEmpty;
import com.uspeedo.common.annotation.USpeedoParam;

public class GetMMSSendReceiptReq extends Request {

    
        
    /**
     * Account ID,Get accountId reference: https://docs.uspeedo.com/docs/mms/api/
     */
    @NotEmpty
    @USpeedoParam("AccountId")
    private Integer accountId;
        
    
        
    /**
     * 
     */
    @USpeedoParam("SessionNoSet")
    private List<String> sessionNoSet;
        
    
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    
    public List<String> getSessionNoSet() {
        return sessionNoSet;
    }

    public void setSessionNoSet(List<String> sessionNoSet) {
        this.sessionNoSet = sessionNoSet;
    }
    
}









