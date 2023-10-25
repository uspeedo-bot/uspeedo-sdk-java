package com.uspeedo.example;

import com.uspeedo.common.config.Config;
import com.uspeedo.common.credential.Credential;
import com.uspeedo.common.exception.USpeedoException;
import com.uspeedo.asms.models.*;
import com.uspeedo.asms.client.AsmsClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void invokeSendMessage() {
        AsmsClient asmsClient = getClient();

        SendBatchUSMSMessageReq req = new SendBatchUSMSMessageReq();

        SendBatchUSMSMessageReq.SendInfo info = new SendBatchUSMSMessageReq.SendInfo();
        SendBatchUSMSMessageReq.TargetPhone targetPhone = new SendBatchUSMSMessageReq.TargetPhone();
        info.setSenderId("uspeedo");
        info.setTemplateId("UTAXXXXXXXXXXX");

        targetPhone.setPhone("(11)11111111");
        String[] templateParams = {"xxxx"};
        targetPhone.setTemplateParams(Arrays.asList(templateParams));

        info.setTarget(Collections.singletonList(targetPhone));
        req.setTaskContent(Collections.singletonList(info));

        try {
            SendBatchUSMSMessageResp resp = asmsClient.sendBatchUSMSMessage(req);
            System.out.println(resp);
        } catch (USpeedoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void invokeTemplateAPi() {
        AsmsClient asmsClient = getClient();

        // Create Template
        CreateUSMSTemplateReq createUSMSTemplateReq = new CreateUSMSTemplateReq();
        createUSMSTemplateReq.setTemplate("Your verification code is1 {1}");
        createUSMSTemplateReq.setPurpose(1);
        createUSMSTemplateReq.setRemark("this is a test template");
        createUSMSTemplateReq.setTemplateName("test template");
        try {
            CreateUSMSTemplateResp createUSMSTemplateResp = asmsClient.createUSMSTemplate(createUSMSTemplateReq);
            System.out.println(createUSMSTemplateResp);
        } catch (USpeedoException e) {
            System.out.println(e.getMessage());
        }


        // Query Template

        QueryUSMSTemplateReq queryTemplateReq = new QueryUSMSTemplateReq();
        String[] templateIds = {"UTAxxxxxxxxx"};
        queryTemplateReq.setTemplateId(Arrays.asList(templateIds));

        try {
            QueryUSMSTemplateResp queryTemplateResp = asmsClient.queryUSMSTemplate(queryTemplateReq);
            System.out.println(queryTemplateResp.getData());
        } catch (USpeedoException e) {
            System.out.println(e.getMessage());
        }

        // Update Template

        UpdateUSMSTemplateReq updateTemplateReq = new UpdateUSMSTemplateReq();
        updateTemplateReq.setTemplateId("UTAxxxxxxxxx");
        updateTemplateReq.setTemplate("Your verification code is {1},thanks");

        try {
            UpdateUSMSTemplateResp updateTemplateResp = asmsClient.updateUSMSTemplate(updateTemplateReq);
            System.out.println(updateTemplateResp);
        } catch (USpeedoException e) {
            System.out.println(e.getMessage());
        }

        // Delete Template
        DeleteUSMSTemplateReq deleteTemplateReq = new DeleteUSMSTemplateReq();
        deleteTemplateReq.setTemplateIds(Arrays.asList(templateIds));

        try {
            DeleteUSMSTemplateResp deleteTemplateResp = asmsClient.deleteUSMSTemplate(deleteTemplateReq);
            System.out.println(deleteTemplateResp);
        } catch (USpeedoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static AsmsClient getClient() {
        Config config = new Config();
        config.setLogger(logger);

        String publicKey = System.getenv("USpeedo_PUBLIC_KEY");
        String privateKey = System.getenv("USpeedo_PRIVATE_KEY");
        Credential credential = new Credential(publicKey, privateKey);
        return new AsmsClient(config, credential);
    }

    public static void main(String[] args) {
//        invokeTemplateAPi();
        invokeSendMessage();
    }
}
