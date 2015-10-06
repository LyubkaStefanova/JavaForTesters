package com.javafortesters.testwithyourownclasses.domainobject;

import com.javafortesters.domainobject.TestAppEnv; //static usage

import org.junit.Test;

import static org.junit.Assert.assertEquals; //static import

public class V2TestAppEnvironmentTest {

    @Test
    public void canGetURlStatically() {
        assertEquals("Returns Hard coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the domain",
                "192.123.0.3",
                TestAppEnv.DOMAIN);

        assertEquals("Just the port",
                "67",
                TestAppEnv.PORT);
    }

}
