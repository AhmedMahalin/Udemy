package Junittest;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Calculator {
    public static int  calculate(){
    int a = 1;
    int b = 5;
    int sum = a + b;
        return sum;
    }

    @Test
    public void testCalculator(){
        assertEquals(10, calculate());
    }
}
