package com.javafortesters.chap016randomdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

public class RandomDataTest {

    @Test
    public void generateRandomBoolean(){
        Random generate = new Random();
        boolean randomBoolean = generate.nextBoolean();
        System.out.println("Your random boolean value is: " + randomBoolean);
    }

    @Test
    public void generateRandomInt(){
        Random generate = new Random();
        int randomInt = generate.nextInt();
        System.out.println("Your random int value is: " + randomInt);
    }

    @Test
    public void generateRandomIntRange(){
       Random generate = new Random();
       int randomIntRange = generate.nextInt(12);
        System.out.println("Your random int range value is: " + randomIntRange);
    }

    @Test
    public void generateRandomLong(){
        Random generate = new Random();
        long randomLong = generate.nextLong();
        System.out.println("Your random long value is: " + randomLong);
    }

    @Test
    public void generateRandomDouble(){
        Random generate = new Random();
        double randomDouble = generate.nextDouble();
        System.out.println("Your random double value is: " + randomDouble);
    }

    @Test
    public void generateRandomGaussian(){
        Random generate = new Random();
        double randomGaussian = generate.nextGaussian();
        System.out.println("Your random Gaussian value is: " + randomGaussian);
    }

    @Test
    public void generateRandomByte(){
        Random generate = new Random();
        int arrayLength = generate.nextInt(100);
        byte[] randomByte = new byte[arrayLength];
        generate.nextBytes(randomByte);
        Assert.assertEquals(arrayLength, randomByte.length);
    }

    @Test
    public void generate1000NumbersInclusively(){
        int minValue = 15;
        int maxValue = 20;
        int fifteen = 0;
        int sixteen = 0;
        int seventeen = 0;
        int eighteen = 0;
        int nineteen = 0;
        int twenty = 0;

        Random generate = new Random();

        for(int x=0; x<1000; x++){
            int randomRange = generate.nextInt(maxValue - minValue + 1) + minValue;
            if(randomRange == 15){
                fifteen++;
            }
            if(randomRange == 16){
                sixteen++;
            }
            if(randomRange == 17){
                seventeen++;
            }
            if(randomRange == 18){
                eighteen++;
            }
            if(randomRange == 19){
                nineteen++;
            }
            if(randomRange == 20){
                twenty++;
            }

        }
        assertNotEquals(0, fifteen);
        assertNotEquals(0, sixteen);
        assertNotEquals(0, seventeen);
        assertNotEquals(0, eighteen);
        assertNotEquals(0, nineteen);
        assertNotEquals(0, twenty);
    }

    @Test
    public void nextTest(){

    }

}
