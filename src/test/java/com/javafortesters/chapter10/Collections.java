package com.javafortesters.chapter10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Collections {
    Collection<String> workDays = new <String> ArrayList();
    Collection<String> weekendDays = new <String> ArrayList();
    Collection<String> daysOfWeek = new <String> ArrayList();

    public void addDays(){
        workDays.add("Monday");
        workDays.add("Tuesday");
        workDays.add("Wednesday");
        workDays.add("Thursday");
        workDays.add("Friday");

        weekendDays.add("Saturday");
        weekendDays.add("Sunday");
    }

    @Test
    public void testCollections() {
        /*workDays.add("Monday");
        workDays.add("Tuesday");
        workDays.add("Wednesday");
        workDays.add("Thursday");
        workDays.add("Friday");

        weekendDays.add("Saturday");
        weekendDays.add("Sunday");*/

        addDays();

        daysOfWeek.addAll(workDays);

        assertEquals(5, workDays.size());
        assertEquals(2, weekendDays.size());
        assertEquals(workDays.size(), daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(workDays));
        System.out.println("first 4 asserts passed");
        System.out.println(daysOfWeek);
    }

    @Test
    public void testAddAllCollections() {
        addDays();

        daysOfWeek.addAll(workDays);
        daysOfWeek.addAll(weekendDays);

        assertEquals(7, daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(weekendDays));
        System.out.println();
        System.out.println("the second 2 asserts passed as well");
        System.out.println();
        System.out.println("daysOfWeek = " + daysOfWeek);

        assertFalse(weekendDays.contains("Funday"));
        assertTrue(weekendDays.contains("Sunday"));
        System.out.println();
        System.out.println("the last 2 asserts passed as well");
        System.out.println();

        for (String dayOfWeek : daysOfWeek) {
            System.out.println(dayOfWeek);
        }

    }

    @Test
    public void testClearCollections() {
        addDays();
        daysOfWeek.addAll(workDays);
        daysOfWeek.addAll(weekendDays);

        daysOfWeek.clear();

        assertEquals(0, daysOfWeek.size());
        assertTrue(daysOfWeek.isEmpty());
        System.out.println();
        System.out.println("clear and empty asserts passed as well");

        daysOfWeek.addAll(workDays);
        daysOfWeek.addAll(weekendDays);//again all days are in daysOfWeek
    }

    @Test
    public void testRemoveAllCollections() {
        addDays();
        daysOfWeek.addAll(workDays);
        daysOfWeek.addAll(weekendDays);

        daysOfWeek.removeAll(weekendDays);

        assertTrue(daysOfWeek.containsAll(workDays));
        assertFalse(daysOfWeek.containsAll(weekendDays));
        assertEquals(5, daysOfWeek.size());

        System.out.println();
        System.out.println("remove all asserts passed as well");

        daysOfWeek.addAll(weekendDays);///again all days are in daysOfWeek

    }


    @Test
    public void testRetainAllCollections() {
        addDays();

        daysOfWeek.addAll(workDays);
        daysOfWeek.addAll(weekendDays);

        daysOfWeek.retainAll(weekendDays);

        assertTrue(daysOfWeek.containsAll(weekendDays));
        assertFalse(daysOfWeek.containsAll(workDays));
        assertEquals(2, daysOfWeek.size());

        System.out.println();
        System.out.println("retains all asserts passed as well");


    }







}
