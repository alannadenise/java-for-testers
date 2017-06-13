package com.javafortesters.chap017datetime;

import org.junit.Test;

import javax.xml.bind.SchemaOutputResolver;

import java.util.Calendar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DateAndTimeTest {

    @Test
    public void currentTimeMillis(){
        long startTime = System.currentTimeMillis();

        for(int x=0; x < 10; x++){
            System.out.println("Current Time " + System.currentTimeMillis());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time " + (endTime - startTime));
    }

    @Test
    public void currentTimeNano(){
        long startTime = System.nanoTime();

        for(int x=0; x < 10; x++){
            System.out.println("Current Time " + System.nanoTime());
        }

        long endTime = System.nanoTime();
        System.out.println("Total Time " + (endTime - startTime));
    }

    @Test //My attempt at creating a unique username (I got stuck) -the answer is in the next test.
    public void createUniqueUserName(){
        String initialUsername = "user" + System.currentTimeMillis();
        System.out.println(initialUsername);
        for(int i = 4; i < initialUsername.length(); i++) {
            char character = initialUsername.charAt(i);
            System.out.println(character);
        }
    }

    @Test
    public void createAUniqueUserIDAllChars(){

        String initialUserID = "user" + System.currentTimeMillis();
        System.out.println(initialUserID);

        String userID = initialUserID;

        for(int x = 0; x< 10; x++){
            String charReplacement = "" + ((char)('a'+x));
            String intToReplace = String.valueOf(x);
            userID = userID.replace( intToReplace, charReplacement);
        }

        assertThat(userID.contains("0"), is(false));
        assertThat(userID.contains("1"), is(false));
        assertThat(userID.contains("2"), is(false));
        assertThat(userID.contains("3"), is(false));
        assertThat(userID.contains("4"), is(false));
        assertThat(userID.contains("5"), is(false));
        assertThat(userID.contains("6"), is(false));
        assertThat(userID.contains("7"), is(false));
        assertThat(userID.contains("8"), is(false));
        assertThat(userID.contains("9"), is(false));

        assertThat(initialUserID.length(), is(userID.length()));

        System.out.println(userID);
    }

    @Test
    public void calendarObjectToString(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.toString());
    }

    @Test
    public void calendarConstants(){
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.DECEMBER, 15, 23, 49, 54);

        assertThat(cal.get(Calendar.MONTH), is(Calendar.DECEMBER));
        assertThat(cal.get(Calendar.MONTH), is(11));
        assertThat(cal.get(Calendar.YEAR), is(2013));
        assertThat(cal.get(Calendar.DAY_OF_MONTH), is(15));
        assertThat(cal.get(Calendar.HOUR_OF_DAY), is(23));
        assertThat(cal.get(Calendar.MINUTE), is(49));
        assertThat(cal.get(Calendar.HOUR), is(11));
        assertThat(cal.get(Calendar.AM_PM), is(Calendar.PM));
        assertThat(cal.get(Calendar.DAY_OF_WEEK), is (Calendar.SUNDAY));
        assertThat(cal.get(Calendar.DAY_OF_WEEK), is(1));
        assertThat(cal.get(Calendar.DAY_OF_YEAR), is(349));

        cal.roll(Calendar.MONTH, 6);
        assertThat(cal.get(Calendar.MONTH), is(Calendar.JUNE));
        cal.roll(Calendar.DAY_OF_MONTH, -12);
        assertThat(cal.get(Calendar.DAY_OF_MONTH), is(3));
        cal.roll(Calendar.YEAR, -2);
        assertThat(cal.get(Calendar.YEAR), is(2011));
    }

    @Test
    public void addMovesTheYear(){
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.DECEMBER, 15, 23, 49, 54);

        cal.add(Calendar.DAY_OF_MONTH, 17);
        assertThat(cal.get(Calendar.DAY_OF_MONTH), is(1));
        assertThat(cal.get(Calendar.MONTH), is(Calendar.JANUARY));
        assertThat(cal.get(Calendar.YEAR), is(2014));
    }
}
