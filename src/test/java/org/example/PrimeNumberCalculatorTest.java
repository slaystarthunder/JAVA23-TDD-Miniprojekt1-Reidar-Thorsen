package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCalculatorTest {

        @Test
        public void isPrime_supposedToBeTrueForPrimeNumbers() {
            PrimeNumberCalculator calculator = new PrimeNumberCalculator();

            // Tests if isPrime returns one of the 4 prime numbers between 0 and 10
            assertTrue(calculator.isPrime(2));
            assertTrue(calculator.isPrime(3));
            assertTrue(calculator.isPrime(5));
            assertTrue(calculator.isPrime(7));


        }
}