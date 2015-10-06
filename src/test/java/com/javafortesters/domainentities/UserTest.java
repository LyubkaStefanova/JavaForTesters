package com.javafortesters.domainentities;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user =new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("default username expected",
                "username",
                user.getUsername());
        assertEquals("default password expected",
                "password",
                user.getPassword());
    }

    /*@Test //when username in class User is public instead of private
    public void userHasSettedUsername(){
        User auser = new User();
        auser.username = "bob";
        assertEquals("user has the setted username",
                "bob",
                auser.username);
    }*/

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin","pass123" );
        assertEquals("given username expected",
                "admin",
                user.getUsername());
        assertEquals("given password expected",
                "pass123",
                user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstucted(){
        User user = new User();
        user.setPassword("PaZZwor6");

        assertEquals("setter password expected",
                "PaZZwor6",
                user.getPassword());
    }
}
