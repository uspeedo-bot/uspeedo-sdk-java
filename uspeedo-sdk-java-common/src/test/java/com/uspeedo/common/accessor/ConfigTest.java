package com.uspeedo.common.accessor;

import com.uspeedo.common.config.Config;
import com.uspeedo.common.exception.RetCodeException;
import com.uspeedo.common.exception.ValidatorException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;

public class ConfigTest {

    @Test
    public void testCaseConfigAccessor() {
        Config cfg = new Config();

        String baseUrl = "https://api.uspeedo.com/api";
        cfg.setBaseUrl(baseUrl);
        Assert.assertEquals(baseUrl, cfg.getBaseUrl());

        String userAgent = "Demo/0.42";
        cfg.setUserAgent(userAgent);
        Assert.assertEquals(userAgent, cfg.getUserAgent());

        Integer timeout = 1;
        cfg.setTimeout(timeout);
        Assert.assertEquals(timeout, cfg.getTimeout());

        Integer maxRetries = 1;
        cfg.setMaxRetries(maxRetries);
        Assert.assertEquals(maxRetries, cfg.getMaxRetries());

        Logger logger = null;
        cfg.setLogger(logger);
        Assert.assertEquals(logger, cfg.getLogger());
    }

    @Test
    public void testException() {
        RetCodeException retCodeException = new RetCodeException(42, "", "");
        Assert.assertEquals(new Integer(42), retCodeException.getRetCode());
        Assert.assertEquals("", retCodeException.getRequestId());

        ValidatorException validatorException = new ValidatorException("");
        try {
            throw validatorException;
        } catch (ValidatorException e) {
            Assert.assertEquals(validatorException, e);
        }
    }
}
