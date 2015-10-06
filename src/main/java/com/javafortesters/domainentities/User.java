package com.javafortesters.domainentities;

public class User {

    private String username; //field
    private String password;

    public User() { //default constructor
       /* username = "username";
        password = "password";
        the same code is duplicated here and in the constructor below so */
        this("username", "password"); //calling the constructor below and set the default username and pass
    }

    public User(String username, String password) { //constructor that accepts parameters - username and password
        this.username = username; //with this the field username is accessed
        this.password = password;
    }

    public String getUsername() { //getter
        return username;
    }

    public String getPassword() { //getter
        return password;
    }

    public void setPassword(String password) { //setter
        this.password = password;
    }
}
