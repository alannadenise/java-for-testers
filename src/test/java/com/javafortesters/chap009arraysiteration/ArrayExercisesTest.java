package com.javafortesters.chap009arraysiteration;

import com.javafortesters.chap009arrays.Chap009Methods;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayExercisesTest {

    @Test
    public void createAnArrayOfUsers(){
        User[] user = new User[3];

        user[0] = new User ("Andy", "andysP455word");
        user[1] = new User ("Alyssa", "alyssasP455word");
        user[2] = new User ("Alanna", "alannasP455word");

        assertEquals("Andy", user[0].getUsername());
        assertEquals("Alyssa", user[1].getUsername());
        assertEquals("Alanna", user[2].getUsername());

        assertEquals("andysP455word", user[0].getPassword());
        assertEquals("alyssasP455word", user[1].getPassword());
        assertEquals("alannasP455word", user[2].getPassword());

        for(User variable : user){
            System.out.println(variable.getUsername());
        }
    }

    @Test
    public void arrayOf100Users(){
        User[] hundredUserArray = new User[100];

        for(int i=0; i<100; i++){
            hundredUserArray[i] = new User ("User" + (i+1), "Password" + (i+1) );
            System.out.println(hundredUserArray[i].getUsername() + " " + hundredUserArray[i].getPassword());
            assertEquals("User" + (i+1), hundredUserArray[i].getUsername());
            assertEquals("Password" + (i+1), hundredUserArray[i].getPassword());
        }

    }

    @Test
    public void workdaysArraySort(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Arrays.sort(workdays);
        assertEquals("Friday", workdays[0]);
        assertEquals("Monday", workdays[1]);
        assertEquals("Thursday", workdays[2]);
        assertEquals("Tuesday", workdays[3]);
        assertEquals("Wednesday", workdays[4]);

    }

    @Test
    public void workdaysCaseArraySort(){
        String[] workdayscase = {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};

        Arrays.sort(workdayscase);
        assertEquals("Friday", workdayscase[0]);
        assertEquals("Tuesday", workdayscase[1]);
        assertEquals("Wednesday", workdayscase[2]);
        assertEquals("monday", workdayscase[3]);
        assertEquals("thursday", workdayscase[4]);

    }

    @Test
    public void createTriangle2dArray(){
        int[][] triangle = new int[16][];

        for(int row=0; row < triangle.length; row++){
            triangle[row] = new int[row+1];
            for(int i=0; i < (row+1); i++){
                triangle[row][i]=i;
            }
        }
        Chap009Methods.print2DPrintArray(triangle);
    }

    @Test
    public void test2DArray(){
        int[][] myWorking = new int[16][];

        for(int row =0; row < 16; row++){
            myWorking[row] = new int[row+1];
            for(int column = 0; column < (row+1); column++) {
                myWorking[row][column] = column;
            }
        }
        Chap009Methods.print2DPrintArray(myWorking);
    }



}
