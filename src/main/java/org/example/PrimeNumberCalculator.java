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

    // This method counts prime numbers within a given range [start, end]
    public int countPrimeNumbers(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public int sumPrimeNumbers(int start, int end) {
        // Initalize the sum to 0
        int sum = 0;

        // Loop through all numbers in the given range
        for (int i = start; i <= end; i++) {
            // Check the current number i is a prime number
            if (isPrime(i)) {
                // Add the prime number to total sum
                sum += i;
            }
        }

        return sum;
    }

}
