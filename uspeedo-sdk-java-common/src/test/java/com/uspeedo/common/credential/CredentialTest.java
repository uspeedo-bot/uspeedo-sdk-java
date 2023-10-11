package com.uspeedo.common.credential;

import static org.junit.Assert.*;

import com.uspeedo.common.annotation.USpeedoParam;
import com.uspeedo.common.exception.USpeedoException;
import com.uspeedo.common.request.Request;

import org.junit.Assert;
import org.junit.Test;

public class CredentialTest {

    private static final String pubKey = "0dca1d51a9b3113c6f562acb0f813bce";
    private static final String priKey = "NTk1Mzk0MAItOWI0My10MGM4LTg0NmMMNDM0ZGM5Y2ZkMmNk";

    static class DemoRequest extends Request {

        DemoRequest() {
            super();
        }

        @USpeedoParam("AccountId")
        private Integer accountId;

        public Integer getAccountId() {
            return accountId;
        }

        public void setAccountId(Integer accountId) {
            this.accountId = accountId;
        }

        @USpeedoParam("Purpose")
        private Integer purpose;

        public Integer getPurpose() {
            return purpose;
        }

        public void setPurpose(Integer purpose) {
            this.purpose = purpose;
        }

        @USpeedoParam("Template")
        private String template;

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        @USpeedoParam("TemplateName")
        private String templateName;

        public String getTemplateName() {
            return templateName;
        }

        public void setTemplateName(String templateName) {
            this.templateName = templateName;
        }

    }

    @Test
    public void verifyAc() throws USpeedoException {
        Credential cred = new Credential(pubKey, priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        cred.setPublicKey(pubKey);
        cred.setPrivateKey(priKey);
        Assert.assertEquals(pubKey, cred.getPublicKey());
        Assert.assertEquals(priKey, cred.getPrivateKey());

        DemoRequest request = new DemoRequest();
        request.setAction("CreateUSMSTemplate");
        request.setAccountId(60000011);
        request.setPurpose(1);
        request.setTemplate("your code is {1}");
        request.setTemplateName("demo");

        assertEquals("11a0430ae6f1a4dc0c656e64dfc1886b0ac4b63a", cred.verifyAc(request));
    }

}
