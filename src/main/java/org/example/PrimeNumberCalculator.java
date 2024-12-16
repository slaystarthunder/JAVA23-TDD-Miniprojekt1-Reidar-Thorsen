package org.example;

public class PrimeNumberCalculator {

    // This method checks if a number greater than 1 has no positive divisors other than
    // 1 and itself, which makes it a prime number
    public boolean isPrime(int number) {

        // Check if number is less than 2, to invalidate edge cases right away
        if (number < 2) return false;

        // Loop through all numbers from 2 up to the square root of 'number'. If any
        // of those numbers divide 'number' without a remainder, the number is NOT a prime number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

}
