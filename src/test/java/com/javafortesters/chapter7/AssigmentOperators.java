package com.javafortesters.chapter7;


import org.junit.Test;

import static org.junit.Assert.*;

public class AssigmentOperators {

    @Test
    public void assigmentOperatorsExplored(){
        int num =10;

        num +=2;
        assertEquals(12, num);
        System.out.println("num +=2 = " + num);

        num -=4;
        assertEquals(8, num);
        System.out.println("num -=4 = " + num);

        num *=2;
        assertEquals(16, num);
        System.out.println("num *=2 = " + num);

        num /=2;
        assertEquals(8, num);
        System.out.println("num /=2 = " + num);

        num %=3;
        assertEquals(2, num);
        System.out.println("num %=3 = " + num);
    }

    @Test
    public void increasementDecreasementOperatorsExplored() {
        int a = 10;
        int b = 20;

        assertEquals(11, ++a);
        System.out.println("++a = " + a);

        assertEquals(20, b++);
        System.out.println("b++ = " + b);

        assertEquals(10, --a);
        System.out.println("--a = " + a);

        assertEquals(21, b--);
        System.out.println("b-- = " + b);
    }

    @Test
    public void booleanOperatorsExplored() {
        assertTrue(4 == 4);
        assertTrue(4 != 5);
        assertTrue(3 < 5);
        assertTrue(7 > 5);
        assertTrue(5 >= 5);
        assertTrue(8 >= 5);
        assertTrue(2 <= 5);
        assertTrue(!false);
    }

    @Test
    public void conditionalOperatorsExplored() {
        assertTrue(true && true);
        assertTrue(true || true);
        assertTrue( false || true);
        assertFalse(false || false);
        assertFalse(false && true);
        assertFalse(false && false);
    }
    @Test
    public void ternaryOperatorsExplored() {
        int x;
        x = 4>3 ? 2 : 1;
        assertEquals(2, x);
        System.out.println("x = " + x);
        assertTrue(5 >= 4 ? true : false);
    }

}
