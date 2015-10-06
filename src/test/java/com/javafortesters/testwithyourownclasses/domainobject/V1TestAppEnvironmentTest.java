package com.javafortesters.testwithyourownclasses.domainobject;

import com.javafortesters.domainobject.TestAppEnv; //static usage
import org.junit.Assert; //static usage
import org.junit.Test;

public class V1TestAppEnvironmentTest {

    @Test
    public void canGetURlStatically() {
        Assert.assertEquals("Returns Hard coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        Assert.assertEquals("Just the domain",
                "192.123.0.3",
                TestAppEnv.DOMAIN);

        Assert.assertEquals("Just the port",
               "67",
               TestAppEnv.PORT);
    }
}
