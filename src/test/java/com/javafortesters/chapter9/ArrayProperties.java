package com.javafortesters.chapter9;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayProperties {

    String [] workdays = {"Monday",
                         "Tuesday",
                         "Wednesday",
                         "Thursday",
                         "Friday"};



   @Test
   public void takeArrayProperties(){
       String [] weekDays = Arrays.copyOf(workdays, 7);

       for (int i = 0; i < weekDays.length; i++){
           System.out.println(weekDays[i]);
       }

       System.out.println();

       assertEquals(null,
                    weekDays[5]);

       assertEquals(null,
                    weekDays[5]);

       weekDays[5] = "Saturday";
       weekDays[6] = "Sunday";

       for (int i = 0; i < weekDays.length; i++){
           System.out.println(weekDays[i]);
       }

       System.out.println();

   }



    @Test
    public void takeArrayProperties1(){
        String [] weekDays1 = Arrays.copyOf(workdays, 3);

        for (int i = 0; i < weekDays1.length; i++){
            System.out.println(weekDays1[i]);
        }

        assertEquals(3,
                    weekDays1.length);

        assertEquals("Monday, Tuesday, Wednesday",
                     weekDays1[0] + ", " + weekDays1[1]+ ", " + weekDays1[2] );
    }



    @Test
    public void takeArrayProperties2(){
        String [] weekDays2 = Arrays.copyOfRange(workdays, 2, 5);

        for (int i = 0; i < weekDays2.length; i++){
            System.out.println(weekDays2[i]);
        }

        assertEquals(3, weekDays2.length);
        assertEquals("Wednesday", weekDays2[0]);
        assertEquals("Thursday", weekDays2[1]);
        assertEquals("Friday", weekDays2[2]);

        assertEquals(weekDays2[0], workdays[2]);
        assertEquals( weekDays2[1], workdays[3] );
        assertEquals(weekDays2[2], workdays[4]);
    }

    @Test
    public void fillArray(){
        int[] minusOne = new int[30];
        Arrays.fill(minusOne, -1);

        for (int i = 0; i < minusOne.length; i++){
            System.out.println("index is " + i +" value in the array is " + minusOne[i]);
        }
    }

    @Test
    public void fillNotTheEntireArray(){
        int[] tenItems = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        Arrays.fill(tenItems, 5, 10, 2 );

        for (int i = 0; i < tenItems.length; i++){
            System.out.println("index is " + i +" value in the array is " + tenItems[i]);
        }

        for (int i = 5; i < tenItems.length; i++){
            assertEquals(2, tenItems[i]);
        }

    }

    @Test
    public void sortArray(){
        int[] outOfOrder = {9, 7, 8, 2, 4, 3, 6, 1, 5, 0};
        for (int i = 0; i < outOfOrder.length; i++){
            System.out.println("index is " + i +" value in the array is " + outOfOrder[i]);
        }
        System.out.println();

        Arrays.sort(outOfOrder);

        for (int i = 0; i < outOfOrder.length; i++){
            System.out.println("index is " + i +" value in the array is " + outOfOrder[i]);
        }

        for (int i = 0; i < outOfOrder.length; i++){
            assertEquals(i, outOfOrder[i]);
        }

    }

    @Test
    public void multidimensionalArrays(){
        int[][] multi = new int[4][4];

       for(int f=0; f < multi.length; f++){
           for (int i=0; i<multi[f].length; i++){
             //  System.out.println("element on roll "+ f + " and column " + i +" is " + multi[f][i]);
           }
       }

       assertEquals(0,multi[0][1]);

        int[][] multiNotDefault = {{1, 2, 3, 4},
                                     {5, 6, 7, 8},
                                     {9, 0, 11, 12},
                                     {13, 14, 15, 16}
                                 };

        for(int f=0; f < multiNotDefault.length; f++){
            for (int i=0; i < multiNotDefault[f].length; i++){
               // System.out.println("element on roll "+ f + " and column " + i +" is " + multiNotDefault[f][i]);
            }
        }

        assertEquals(1,multiNotDefault[0][0]);
        assertEquals(7,multiNotDefault[1][2]);
        assertEquals(12,multiNotDefault[2][3]);
        assertEquals(14,multiNotDefault[3][1]);

        int[][][] multi3d = new int[3][4][5];
        assertEquals(3, multi3d.length);
        assertEquals(4, multi3d[0].length);
        assertEquals(4, multi3d[1].length);
        assertEquals(4, multi3d[2].length);
        assertEquals(5, multi3d[0][0].length);
        assertEquals(5, multi3d[0][1].length);
        assertEquals(5, multi3d[0][2].length);
        assertEquals(5, multi3d[0][3].length);
        assertEquals(5, multi3d[1][1].length);
        assertEquals(5, multi3d[2][2].length);
        assertEquals(5, multi3d[2][3].length);

        int[][] ragged2d = {{1, 2, 3, 4},
                            {5, 6},
                            {7, 8, 9}
                            };
        assertEquals(4, multi3d[0][3].length);
        assertEquals(6, multi3d[1][1].length);
        assertEquals(7, multi3d[2][0].length);

    }
}
