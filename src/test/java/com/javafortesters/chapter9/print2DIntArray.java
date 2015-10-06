package com.javafortesters.chapter9;

public class print2DIntArray {

    public void print2DIntArray(int[][] multi){
        for(int[] outer : multi){
            if(outer == null){
                System.out.println("null");
            }else{
                for(int inner: outer){
                    System.out.println(inner + ", ");
                }
            }
            System.out.println(" ");

        }
    }


}
