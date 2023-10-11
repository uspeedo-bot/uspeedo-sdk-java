# Quick start

## Install

Use `maven` to install (recommended) and configure `pom.xml`:

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<project
        xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
>
    <parent>
        <artifactId>uspeedo-sdk-java</artifactId>
        <groupId>com.uspeedo</groupId>
        <version>1.0.0-SNAPSHOT</version>
    </parent>

    <modelVersion>4.0.0</modelVersion>
    <artifactId>uspeedo-sdk-example-sms</artifactId>
    <version>0.1.0</version>

    <dependencies>
        <dependency>
            <groupId>com.uspeedo</groupId>
            <artifactId>uspeedo-sdk-java-sms</artifactId>
            <version>1.0.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
</project>
```

## First time use

Currently, the SDK uses PublicKey/PrivateKey as the only authentication method. The public and private keys can be
obtained from the following channels:

- [Account Key Management](https://console.uspeedo.com/dashboard)

A simple example is provided below (detailed examples are available in `examples/sms`):

Then edit the source code:

```java
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

        Client__GetMessageSummaryRequest getMessageSummaryRequest = new Client__GetMessageSummaryRequest();

        Console__data_console_GetMessageSummaryResponse getMessageSummaryResponse = null;
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

```

Every api call in the SDK has detailed annotation documentation.
You can jump to the specific method through Editor/IDE to view it (you can
also [view the interface document](https://docs.uspeedo.com/)),
And continue to explore the usage of the SDK based on the IDE's auto-completion and error messages.

If you need to know the usage techniques mentioned but not fully covered by this code, please refer to:

- [Common configuration](configure.md), learn how to configure the SDK, such as logs, retries, service access
  endpoints (public cloud, private cloud), etc.
- [Error Handling](error.md), learn how to handle different types of SDK exceptions, including parameter errors,
  business exceptions where RetCode is not 0, etc.
- [Request Middleware](middleware.md), learn how to intercept requests initiated by the SDK and add additional logic
  uniformly.
- [Generalized Call](generic.md), how to call APIs that are not yet supported by the SDK (the use of such APIs is not
  recommended because there is no compatibility guarantee)
