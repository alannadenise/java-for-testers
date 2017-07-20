package com.javafortesters.chap20mathandbigdecimal;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void basicArithmeticwithBigDecimal(){
        BigDecimal basicArithmetic = new BigDecimal(0).
                add(new BigDecimal(10)).
                multiply(new BigDecimal(2)).
                subtract(new BigDecimal(10)).
                divide(new BigDecimal(2));

        System.out.println(basicArithmetic);
    }

    @Test
    public void compareTenToOne(){
        assertTrue(BigDecimal.TEN.compareTo( BigDecimal.ONE) > 0);
        assertTrue(BigDecimal.ONE.compareTo( BigDecimal.TEN) < 0);
        assertTrue(BigDecimal.TEN.compareTo( BigDecimal.TEN) == 0);
        assertTrue(BigDecimal.TEN.compareTo( BigDecimal.ONE) != 0);
        assertTrue(BigDecimal.TEN.compareTo( BigDecimal.ONE) >= 0);
        assertTrue(BigDecimal.ONE.compareTo( BigDecimal.TEN) <= 0);
    }

}
