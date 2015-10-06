package com.javafortesters.chapter7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class string {
    @Test
    public void stringConcatenated(){
        assertEquals("123456", "12"+"34"+"56");
    }

    @Test
    public void stringMethods(){
        String string = "a string";

        assertEquals(8, string.length());
        assertTrue(string.compareToIgnoreCase("A String")==0);
        assertTrue(string.contains("ing"));
        assertTrue(string.startsWith("a"));

        assertEquals(' ', string.charAt(1));
        assertEquals("string",string.substring(2));
        

        /*String string = "abcdef";

        assertEquals(6, string.length());
        assertTrue(string.compareToIgnoreCase("AbcdEF")==0);
        assertTrue(string.contains("bcde"));
        assertTrue(string.startsWith("ab"));

        assertEquals('c', string.charAt(2));
        assertEquals("def",string.substring(3));*/
    }
}
