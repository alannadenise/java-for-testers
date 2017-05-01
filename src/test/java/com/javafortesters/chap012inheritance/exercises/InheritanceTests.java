package com.javafortesters.chap012inheritance.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceTests {

    @Test
    public void createEnvironmentUser(){
        EnvironmentUser enuser = new EnvironmentUser();

        assertEquals("username", enuser.getUsername());
        assertEquals("http://192.123.0.3:67", enuser.getUrl());
        assertEquals("Normal", enuser.getPermission());
    }

    @Test
    public void readOnlyUserPrivsAndDefaults(){
        ReadOnlyUser rod = new ReadOnlyUser();

        assertEquals("Read Only", rod.getPermission());
        assertEquals("username", rod.getUsername());
        assertEquals("password", rod.getPassword());
    }
}
