package Junittest;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


    public class FirstUnitTest {
        public static long factorial(long n) {
            if (n == 0) {
                return 1;
            }//Else
            return n * factorial(n - 1);
        }

        @Test
        public void testFactorial() {
            assertEquals(1, factorial(0));
            assertEquals(120, factorial(5));
        }
    }