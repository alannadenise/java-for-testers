package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();

        assertEquals("default username expected",
                "username", user.getUsername());

        assertEquals("default password expected",
                "password", user.getPassword());
    }

    /*@Test
    public void experimentWithPrivateAndPublicFields(){
        User auser = new User();
        auser.username = "bob";
        assertEquals("not default username",
                "bob", auser.username);
    }*/

    @Test
    public void canConstructWithUsernameAndPassword(){

        User user = new User("admin", "pA55w0rd");

        assertEquals("given username expected",
                "admin", user.getUsername());

        assertEquals("given password expected",
                "pA55w0rd", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){

        User user = new User();
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        user.setPassword("PaZZwor6");
        System.out.println(user.getPassword());

        assertEquals("setter password expected",
                "PaZZwor6", user.getPassword());
    }
}
