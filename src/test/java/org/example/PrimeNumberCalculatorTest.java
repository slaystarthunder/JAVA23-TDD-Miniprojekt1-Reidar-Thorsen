package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCalculatorTest {

        @Test
        @DisplayName("Tests if a number is a prime number")
        public void isPrimeTest() {
            PrimeNumberCalculator calculator = new PrimeNumberCalculator();

            // Tests if isPrime returns one of the 4 prime numbers between 0 and 10
            assertTrue(calculator.isPrime(2));
            assertTrue(calculator.isPrime(3));
            assertTrue(calculator.isPrime(5));
            assertTrue(calculator.isPrime(7));
        }

        @Test
        @DisplayName("Counts prime numbers in the range 0 to 10")
        public void countPrimeNumbers() {
            PrimeNumberCalculator calculator = new PrimeNumberCalculator();

            // Range 0 - 10 should contain 4 numbers
            assertEquals(4, calculator.countPrimeNumbers(0,10));
        }

        @Test
        @DisplayName("Calculate the sum of all prime numbers between 0 - 10")
        public void sumPrimeNumbers() {
            PrimeNumberCalculator calculator = new PrimeNumberCalculator();

            // Adding the 4 primes between 0 - 10 should return 17
            assertEquals(17, calculator.sumPrimeNumbers(0, 10));
        }
}