package com.javafortesters.domainobject;

public class TestAppEnv {


    public static final String DOMAIN = "192.123.0.3" ;
    public static final String PORT  = "67";

    public static String getUl() {
    return  "http://" + DOMAIN + ":" + PORT;
    }
}
