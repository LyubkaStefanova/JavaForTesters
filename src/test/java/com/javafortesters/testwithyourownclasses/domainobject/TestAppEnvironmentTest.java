package com.javafortesters.testwithyourownclasses.domainobject;

import static com.javafortesters.domainobject.TestAppEnv.*; //static import
//import static com.javafortesters.domainobject.TestAppEnv.PORT;

//import com.javafortesters.domainobject.TestAppEnv; //static usage
import org.junit.Test;

import static junit.framework.TestCase.assertEquals; //static import

public class TestAppEnvironmentTest {

    @Test
    public void canGetURlStatically() {
        assertEquals("Returns Hard coded URL",
                "http://192.123.0.3:67",
               getUl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the domain",
                "192.123.0.3",
                DOMAIN);

       assertEquals("Just the port",
               "67",
               PORT);
    }
}
