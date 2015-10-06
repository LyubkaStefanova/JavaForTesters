package com.javafortesters.chapter8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConditionalStatemrnt {

    @Test
    public void moreTernary() {
        String url = "www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void ifStatement() {
        String url = "www.seleniumsimplified.com";

        if (!url.startsWith("http")) {
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void ifElseStatement() {
        String url = "www.seleniumsimplified.com";

        if (url.startsWith("http")) {
            //do nothing, url is fine
        } else {
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void nestedIfElseStatement() {
        String url = "seleniumsimplified.com";

        if (url.startsWith("http")) {
            //do nothing, url is fine
        } else {
            if (!url.startsWith("www.")) {
                url = "www." + url;
            }
                url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    public String likelyGenderIs(String title){
        String likelyGender;

        switch(title.toLowerCase()){ //not working ??
            case "sir":
            case "mr":
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }

}