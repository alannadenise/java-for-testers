package com.javafortesters.chap015stringsrevisited;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class StringsRevisitedTest {

    @Test
    public void constructStrings(){
       String aString = new String();
       assertThat(aString.length(), is(0));

       char[] cArray = {'1', '2'};
       assertThat(new String(cArray), is("12"));
       assertThat(new String(cArray, 1, 1), is("2"));

       byte[] bArray = "hello there".getBytes();
       assertThat(new String(bArray, 3, 3), is ("lo "));
    }

    @Test
    public void regionMatches(){
        String hello = "Hello Bella";

        assertTrue(hello.regionMatches(true, 9, "young lady", 6, 2));
    }

    @Test
    public void positionsOfLettersBackwards(){
        String hello = "Hello Bella";
        List<Integer> letters = new ArrayList<Integer>();
        int findL = hello.length();

        while (findL>0) {
            findL = hello.lastIndexOf("l", findL - 1);
            if (findL != -1){
                letters.add(findL);
                System.out.println(findL);
            }
        }
        assertEquals(4, letters.size());
    }

    @Test
    public void positionsOfLettersForwards(){
        String hello = "lHello Bellal";
        String subString = "l";
        List<Integer> letters = new ArrayList<Integer>();
        int findL = 0;

        while (findL!= -1) {
            findL = hello.indexOf(subString, findL);
            if (findL != -1){
                letters.add(findL);
                System.out.println(findL);
                findL++;
            }
        }
        assertEquals(6, letters.size());
    }

    @Test
    public void stringBuilderResize(){
        StringBuilder myBuilder = new StringBuilder (4);
        assertThat(myBuilder.capacity(), is (4));
        myBuilder.append("HERE IS SOME TEXT");
        assertThat(myBuilder.capacity(), is (17));
    }

    @Test
    public void insertIntoAStringBuilder(){
        StringBuilder myOtherBuilder = new StringBuilder();
        assertThat(myOtherBuilder.toString().length(), is(0));
        myOtherBuilder.append("HERES SOME ");
        myOtherBuilder.insert(myOtherBuilder.toString().length(), "TEXT");
        assertThat(myOtherBuilder.toString(), is("HERES SOME TEXT"));
        myOtherBuilder.insert(4, " I");
        assertThat(myOtherBuilder.toString(), is("HERE IS SOME TEXT"));
    }

}
