package com.javafortesters.testwithotherclasses;


import org.junit.Assert;
import org.junit.Test;

public class IntegerExamplesTest {

  @Test
  public void integerExploration(){

      Integer four = new Integer(4);
      Assert.assertEquals("intValue returns int 4", 4, four.intValue());
      System.out.println("IntegerExamplesTest.integerExploration");
      System.out.println("four = " + four);
  }

  @Test
  public void integerExplorationInstantiateString(){
      Integer five = new Integer("5");
      Assert.assertEquals("initValue returns the integer 5", 5, five.intValue());
      System.out.println("IntegerExamplesTest.integerExplorationInstantiateString");
      System.out.println("five = " + five);
  }

  @Test
  public void integerExplorationAutoBoxing() {
      Integer six = 6; //AutoBoxing -Java automatically convert a primitive type to associated class
      Assert.assertEquals("initValue returns the integer 6", 6, six.intValue());
      System.out.println("IntegerExamplesTest.integerExplorationAutoBoxing");
      System.out.println("five = " + six);
  }

  @Test
  public void integerExplorationValueOf() {
      int a = Integer.valueOf("7");
      Assert.assertEquals("valueOf returns 7", 7 , a);
      System.out.println("IntegerExamplesTest.integerExplorationValueOf");
        System.out.println("a = " + a);
    }

    @Test
    public void integerExplorationParseInt() {
       int a =Integer.parseInt("8");
       Assert.assertEquals("parseInt returns 8", 8, a);
      //Assert.assertArrayEquals("parseInt returns 8", 8, Integer.parseInt("8")); not working
       System.out.println("IntegerExamplesTest.integerExplorationParseInt");
       System.out.println("a = " + a);
    }

    @Test
    public void integerExplorationIntToHex(){
        /*String str1 = Integer.toHexString(11);
        String str2 = Integer.toHexString(10);
        String str3 = Integer.toHexString(3);
        String str4 = Integer.toHexString(21);
        Assert.assertTrue("that 11 becomes b", str1 == "b");
        Assert.assertTrue("that 10 becomes a", str2 == "a");
        Assert.assertTrue("that 3 becomes 3", str3 == "3");
        Assert.assertTrue("that 21 becomes 15", str4 == "15");
        System.out.println("IntegerExamplesTest.integerExplorationIntToHex");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
       not working */
      // Assert.assertEquals("hex 11 is b", "b",
          //     Integer.toHexString(11));
       // Assert.assertEquals("hex 10 is a", "a", Integer.toHexString(10));
        //String str1 = Integer.toHexString(11);
        Assert.assertTrue("that 11 becomes b", "b".equals(Integer.toHexString(11)));

      /*  String str = Integer.toHexString(10).toString();
        Assert.assertTrue("that 10 becomes a", str == "a");
        not working as well*/

    }

    @Test
    public void integerExplorationSize(){
        Assert.assertEquals("Min value is  -2147483648", -2147483648, Integer.MIN_VALUE );
        Assert.assertEquals("Min value is  2147483647", 2147483647, Integer.MAX_VALUE );
    }
}
