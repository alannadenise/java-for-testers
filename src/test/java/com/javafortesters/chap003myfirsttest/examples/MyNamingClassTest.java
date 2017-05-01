package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyNamingClassTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer );

    }
}
