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
        Credential credential =
            new Credential(
                System.getenv("USpeedo_PUBLIC_KEY"), System.getenv("USpeedo_PRIVATE_KEY"));
        WhatsAppClient client = new WhatsAppClient(config, credential);

        GetMessageSummaryReq getMessageSummaryRequest = new GetMessageSummaryReq();

        GetMessageSummaryResData getMessageSummaryResponse = null;
        try {
            getMessageSummaryResponse = client.getMessageSummary(getMessageSummaryRequest);
        } catch (RetCodeException e) {
            System.out.println(e.getRetCode());

        } catch (USpeedoException e) {
            e.printStackTrace();
            return;
        }

        String data = getMessageSummaryResponse.getData().toString();

        System.out.println(data);
    }
}
