package com.uspeedo.example;

import com.uspeedo.common.config.Config;
import com.uspeedo.common.credential.Credential;
import com.uspeedo.common.exception.RetCodeException;
import com.uspeedo.common.exception.USpeedoException;
import com.uspeedo.whatsapp.models.*;
import com.uspeedo.whatsapp.client.WhatsAppClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Config config = new Config();

        config.setLogger(logger);
        String publicKey = System.getenv("USpeedo_PUBLIC_KEY");
        String privateKey = System.getenv("USpeedo_PRIVATE_KEY");

        if (publicKey == null || privateKey == null) {
            logger.error("Environment variables USpeedo_PUBLIC_KEY and/or USpeedo_PRIVATE_KEY are not set");
            return;
        }

        Credential credential = new Credential(publicKey, privateKey);
        WhatsAppClient client = new WhatsAppClient(config, credential);

        GetMessageSummaryReq getMessageSummaryRequest = new GetMessageSummaryReq();

        GetMessageSummaryResData getMessageSummaryResponse = null;
        try {
            getMessageSummaryResponse = client.getMessageSummary(getMessageSummaryRequest);
        } catch (RetCodeException e) {
            logger.error("RetCodeException occurred: {}", e.getRetCode());
            return;
        } catch (USpeedoException e) {
            logger.error("USpeedoException occurred", e);
            return;
        }

        if (getMessageSummaryResponse == null || getMessageSummaryResponse.getData() == null) {
            logger.error("getMessageSummaryResponse or getMessageSummaryResponse.getData() is null");
            return;
        }

        String data = getMessageSummaryResponse.getData().toString();

        System.out.println(data);
    }
}
