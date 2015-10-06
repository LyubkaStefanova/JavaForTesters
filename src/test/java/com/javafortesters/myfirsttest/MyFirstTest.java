package com.javafortesters.myfirsttest;

        import org.junit.Assert;
        import org.junit.Test;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        System.out.println("MyFirstTest.canAddTwoPlusTwo");
        System.out.println("answer = " + answer);
        Assert.assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void canSubtractTwoMinusTwo(){
        int answer =2-2;
        System.out.println("MyFirstTest.canSubtractTwoMinusTwo");
        System.out.println("answer = " + answer);
        Assert.assertEquals("2-2=0", 0, answer);
    }

    @Test
    public void canDevideFourByTwo(){
        int answer = 4/2;
        System.out.println("MyFirstTest.canDevideFourByTwo");
        System.out.println("answer = " + answer);
        Assert.assertEquals("4/2=2", 2, answer);
    }

    @Test
    public void canMultiplyTwoByTwo(){
        int answer = 2*2;
        System.out.println("MyFirstTest.canMultiplyTwoByTwo");
        System.out.println("answer = " + answer);
        Assert.assertEquals("2*2=4", 4, answer);
    }

}