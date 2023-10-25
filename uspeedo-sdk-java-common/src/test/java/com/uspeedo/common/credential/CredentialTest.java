package com.uspeedo.common.credential;

import static org.junit.Assert.*;

import com.uspeedo.common.annotation.USpeedoParam;
import com.uspeedo.common.exception.USpeedoException;
import com.uspeedo.common.request.Request;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

        @USpeedoParam("TemplateId")
        private List<String> templateId;

        public List<String> getTemplateId() {
            return templateId;
        }

        public void setTemplateId(List<String> templateId) {
            this.templateId = templateId;
        }

        @USpeedoParam("TemplateName")
        private String templateName;

        public String getTemplateName() {
            return templateName;
        }

        public void setTemplateName(String templateName) {
            this.templateName = templateName;
        }

        @USpeedoParam("TaskContent")
        private List<Map<String, Object>> taskContent;

        public List<Map<String, Object>> getTaskContent() {
            return taskContent;
        }

        public void setTaskContent(List<Map<String, Object>> taskContent) {
            this.taskContent = taskContent;
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

    @Test
    public void longArray() throws USpeedoException {
        Credential cred = new Credential(pubKey, priKey);
        cred.setPublicKey(pubKey);
        cred.setPrivateKey(priKey);

        DemoRequest request = new DemoRequest();
        request.setAction("QueryUSMSTemplate");
        request.setAccountId(60000011);
        request.setTemplateId(Arrays.asList("UTA230227EL4IW1", "UTA230227JVIB02"));

        assertEquals("258dc3d2d7115e9e7c9f4dd4910e671e17b224f1", cred.verifyAc(request));
    }

    @Test
    public void longArrayStruct() throws USpeedoException {
        Credential cred = new Credential(pubKey, priKey);
        cred.setPublicKey(pubKey);
        cred.setPrivateKey(priKey);

        DemoRequest request = new DemoRequest();
        request.setAction("SendBatchUSMSMessage");
        List<Map<String, Object>> taskContent = new ArrayList<>();
        Map<String, Object> e = new java.util.HashMap<>();
        e.put("TemplateId", "UTAXXXXXXXXXXX");
        e.put("SenderId", "uspeedo");
        List<Map<String, Object>> value = new ArrayList<>();
        Map<String, Object> phone = new java.util.HashMap<>();
        phone.put("Phone", "1111");
        List<String> stringList = new ArrayList<>();
        stringList.add("1111");
        phone.put("TemplateParams", stringList);
        value.add(phone);
        e.put("Target", value);
        taskContent.add(e);
        request.setTaskContent(taskContent);

        assertEquals("7175ca50d6204dfd469e8aab447810c08f9da53f", cred.verifyAc(request));
    }
}
