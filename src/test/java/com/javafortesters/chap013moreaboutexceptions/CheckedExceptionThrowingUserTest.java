package com.javafortesters.chap013moreaboutexceptions;

import com.javafortesters.chap013moreexceptions.InvalidPassword;
import com.javafortesters.chap013moreexceptions.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CheckedExceptionThrowingUserTest {

    @Test(expected = InvalidPassword.class)
    public void constructUserWithException() throws InvalidPassword {
        User aUser = new User("username", "p");
    }

    @Test
    public void createDefaultUserWithNoThrowsInvalidPasswordException() {
        User aUser = new User();
        assertEquals("Passw0rd",aUser.getPassword());
    }

    @Test
    public void createUserWithInvalidPasswordExceptionMessages(){
        User aUser;

        try {
            aUser = new User("username", "p");
            fail("An Invalid Password Exception should have been thrown");

        } catch (InvalidPassword e) {
            assertTrue(e.getMessage().startsWith("Password must be > 6 chars"));
        }
    }

    @Test
    public void setPasswordWithInvalidPasswordExceptionMessages() {
        User aUser = new User();

        try {
            aUser.setPassword("tiny");
            fail("An Invalid Password Exception should have been thrown");

        } catch (InvalidPassword e) {
            assertTrue(e.getMessage().startsWith("Password must be > 6 chars"));
        }
    }

}