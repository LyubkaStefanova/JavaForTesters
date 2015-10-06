package com.javafortesters.chapter9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arrays {

   String [] workdays = {"Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday"};

    /*String workdays[] = new String[5];

    workdays= ["Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday"]; //not working */

    @Test
    public void accessArrayElements(){
        assertEquals("Monday", workdays[0]);
        System.out.println("workdays[0]  = " + workdays[0]);
        assertEquals("Friday", workdays[4]);
        System.out.println("workdays[4] = " + workdays[4]);

        String days ="";

        //for each loop
        /*int dayIndex =0 ;
        for (String workday : workdays){
            days = days + "|" + workday;
            System.out.println("found " + workday + " at position " + dayIndex);
            dayIndex++;
        }*/
        //for loop
         for( int i=0; i<workdays.length; i++){
            days = days + "|" + workdays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
        assertEquals(5, workdays.length);
        System.out.println(workdays.length);
    }




}

