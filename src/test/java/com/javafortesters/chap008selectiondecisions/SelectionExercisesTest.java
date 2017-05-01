package com.javafortesters.chap008selectiondecisions;

import org.junit.Test;

import static com.javafortesters.chap008methods.Chap008Methods.catOrCats;
import static com.javafortesters.chap008methods.Chap008Methods.countryIs;
import static com.javafortesters.chap008methods.Chap008Methods.writeNumber;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SelectionExercisesTest {

    @Test
    public void catOrCatsTest(){
        assertEquals("2 == cats",
                "cats", catOrCats(2));
    }

    @Test
    public void truthyRidic(){
        boolean truthy = true;
        if(truthy == true) assertTrue(truthy);
    }

    @Test
    public void truthyRidic2(){
        boolean truthy = true;
        if(truthy==true)
            assertTrue(truthy);
        else
            assertFalse(truthy);
    }

    @Test
    public void truthyRidic3(){
        boolean truthy = true;
        if(truthy==true) {
            assertTrue(truthy);
            assertFalse(!truthy);
            System.out.println(truthy);
        }
        else {
            assertFalse(truthy);
            System.out.println(truthy);
        }
    }

    @Test
    public void nestedIfElseHorror(){
        boolean truthy = true;
        boolean falsey = false;

        if(truthy == true){
            if(!falsey){
                if(truthy && !falsey){
                    if(falsey || truthy){
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }

            }
            else{
                assertTrue(truthy);
                assertFalse(falsey);

            }

        }
        else{
            if(!truthy){
                if(falsey){
                    assertTrue(falsey);
                    assertFalse(truthy);
                }
                else{
                    assertFalse(falsey);
                    assertFalse(truthy);
                }
            }
        }
    }

    @Test
    public void countryExample(){
        assertEquals("United Kingdom", countryIs("UK"));
        assertEquals("United States", countryIs("USA"));
        assertEquals("Rest of the world", countryIs("North Pole"));
        assertEquals("United Kingdom", countryIs("uk"));
        assertEquals("United States", countryIs("uSa"));
    }

    @Test
    public void writtenNumberExample(){
        assertEquals("One", writeNumber(1));
        assertEquals("Two", writeNumber(2));
        assertEquals("Three", writeNumber(3));
        assertEquals("Too big", writeNumber(4));
        assertEquals("Too small", writeNumber(0));
    }
}







