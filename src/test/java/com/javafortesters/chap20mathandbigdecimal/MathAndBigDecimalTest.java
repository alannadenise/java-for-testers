package com.javafortesters.chap20mathandbigdecimal;

import org.junit.Test;

import java.math.BigDecimal;

public class MathAndBigDecimalTest {

    @Test
    public void mathsExerciseOne(){
        Double moneyDouble = 5 - 0.43 - 0.73 - 1.73;
        System.out.println("Double maths: " + moneyDouble);

        int moneyInt = 500 - 43 - 73 - 173;
        System.out.println("Integer maths: " + moneyInt);

        BigDecimal moneyBigDecimal = new BigDecimal(5).
                subtract(new BigDecimal(0.43)).
                subtract(new BigDecimal(0.73)).
                subtract(new BigDecimal(1.73));

        System.out.println("Big Decimal maths: " + moneyBigDecimal);
    }

}
