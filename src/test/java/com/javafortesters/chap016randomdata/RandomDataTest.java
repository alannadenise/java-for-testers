package com.javafortesters.chap016randomdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
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
        assertEquals(arrayLength, randomByte.length);
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
    public void nextGaussianDistribution(){
        Random generate = new Random();

        int oneDeviation = 0;
        int twoDeviation = 0;
        int threeDeviation = 0;
        int fourDeviation = 0;

        for(int x=0; x<1000; x++){
            double gaussianDoubles = generate.nextGaussian();
            if(gaussianDoubles > -1.0d && gaussianDoubles < 1.0d){
                oneDeviation++;
            }
            if(gaussianDoubles > -2.0d && gaussianDoubles < 2.0d){
                twoDeviation++;
            }
            if(gaussianDoubles > -3.0d && gaussianDoubles < 3.0d){
                threeDeviation++;
            }
            if(gaussianDoubles > -4.0d && gaussianDoubles < 4.0d){
                fourDeviation++;
            }
        }

        float oneDeviationPercentage = (oneDeviation/1000f)*100f;
        System.out.println("about 70% one standard deviation = " + oneDeviationPercentage);
        float twoDeviationPercentage = (twoDeviation/1000f)*100f;
        System.out.println("about 95% one standard deviation = " + twoDeviationPercentage);
        float threeDeviationPercentage = (threeDeviation/1000f)*100f;
        System.out.println("about 99% one standard deviation = " + threeDeviationPercentage);
        float fourDeviationPercentage = (fourDeviation/1000f)*100f;
        System.out.println("about 99.9% one standard deviation = " + fourDeviationPercentage);

    }

    @Test
    public void ageDistribution(){
        Random generate = new Random();
        Map<Integer, Integer> allAges = new HashMap<Integer, Integer>();

        for(int x=0; x<1000; x++){
            int age = (int)(generate.nextGaussian() * 5 + 35);

            int ageCount = 0;
            if(allAges.containsKey(age)){
                ageCount = allAges.get(age);
            }
            ageCount++;
            allAges.put(age,ageCount);
        }

        System.out.println(allAges);

        SortedSet<Integer> sortedAges = new TreeSet(allAges.keySet());
        System.out.println(sortedAges);
        for(int age : sortedAges) {
            System.out.println(age + " : " + allAges.get(age));
        }

    }

    @Test
    public void randomSeed(){
        Random generate = new Random(1234567L);

        int seedInt = generate.nextInt();
        System.out.println("Your random int value is: " + seedInt);
        assertEquals(seedInt, 1042961893);

        long seedLong = generate.nextLong();
        System.out.println("Your random long value is: " + seedLong);
        assertEquals(seedLong, -6749250865724111202L);
    }

    @Test
    public void randomString(){
        String validValues = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        StringBuilder rString;

        Random random = new Random();

        rString = new StringBuilder();
        for(int x=0; x<100; x++){
            int rndIndex = random.nextInt(validValues.length());
            char rChar = validValues.charAt(rndIndex);
            rString.append(rChar);
        }
        System.out.println(rString.toString());
        Assert.assertTrue(rString.length()==100);
        Assert.assertTrue(rString.toString().matches("[A-Z ]+"));
    }

}
