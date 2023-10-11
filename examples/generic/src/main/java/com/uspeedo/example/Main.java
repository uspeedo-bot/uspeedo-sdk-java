package com.uspeedo.example;

import com.uspeedo.common.client.DefaultClient;
import com.uspeedo.common.config.Config;
import com.uspeedo.common.credential.Credential;
import com.uspeedo.common.exception.RetCodeException;
import com.uspeedo.common.exception.USpeedoException;
import com.uspeedo.common.exception.ValidatorException;
import com.uspeedo.common.request.Request;
import com.uspeedo.common.response.Response;
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
        DefaultClient client = new DefaultClient(config, credential);

        Request request = new Request();
        request.setAction("GetNSPermission");

        Response response = null;
        try {
            response = client.invoke(request, Response.class);
        } catch (ValidatorException e) {
            System.out.println(e.getMessage());
        } catch (RetCodeException e) {
            System.out.println(e.getRetCode());
        } catch (USpeedoException e) {
            e.printStackTrace();
        }
        System.out.println(response);
    }
}
