package com.javafortesters.chap014junitexplored;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.*;

public class AssertExerciseTest {

    @Test
    public void assertTestExercise(){
        int thisNumber = 3;
        Boolean falsey1 = false;
        Boolean truthy1 = true;
        String foo = null;
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] midweek =  {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        assertEquals(3, thisNumber);
        assertFalse(falsey1);
        assertTrue(truthy1);
        assertArrayEquals(workdays, midweek);
        assertNotNull(thisNumber);
        assertNotSame(5, thisNumber);
        assertNull(foo);
        assertSame(3, thisNumber);
    }

    @Test
    public void assertThatTestExercise(){
        int thisOtherNumber = 3;
        Boolean falsey2 = false;
        Boolean truthy2 = true;
        String magic = "magic";
        String foo = null;
        String[] workdays1 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] midweek1 =  {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        assertThat(3, is(thisOtherNumber));
        assertThat(falsey2, is(false));
        assertThat(truthy2, is(true));
        assertThat(workdays1, equalTo(midweek1));
        assertThat(thisOtherNumber, is(not(nullValue())));
        assertThat(thisOtherNumber, is(not(5)));
        assertThat(foo, is(nullValue()));
        assertThat(3, is(thisOtherNumber));
        assertThat(magic, containsString("mag"));
        assertThat(magic, endsWith("ic"));
        assertThat(magic, startsWith("m"));
    }

}


