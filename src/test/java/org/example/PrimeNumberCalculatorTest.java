package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCalculatorTest {

    @Test
    @DisplayName("isPrime: Returns true for prime numbers")
    public void isPrimeReturnsTrueForPrimes() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        assertTrue(calculator.isPrime(2));
        assertTrue(calculator.isPrime(3));
        assertTrue(calculator.isPrime(5));
        assertTrue(calculator.isPrime(7));
    }

    @Test
    @DisplayName("countPrimeNumbers: Returns correct count")
    public void countPrimeNumbersReturnsCorrectCount() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        assertEquals(4, calculator.countPrimeNumbers(0, 10));
    }

    @Test
    @DisplayName("sumPrimeNumbers: Returns correct sum")
    public void sumPrimeNumbersReturnsCorrectSum() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        assertEquals(17, calculator.sumPrimeNumbers(0, 10));
    }

    @Test
    @DisplayName("validateInput: Throws exception for negative start")
    public void validateInputThrowsExceptionForNegativeStart() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.countPrimeNumbers(-1, 10);
        });
        assertEquals("Hoppsan, fel intervall angivet!", exception.getMessage());
    }

    @Test
    @DisplayName("validateInput: Throws exception when start > end")
    public void validateInputThrowsExceptionWhenStartGreaterThanEnd() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.countPrimeNumbers(10, 0);
        });
        assertEquals("Hoppsan, fel intervall angivet!", exception.getMessage());
    }

    @Test
    @DisplayName("validateInput: Throws exception for range exceeding limit")
    public void validateInputThrowsExceptionForRangeExceedingLimit() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.countPrimeNumbers(0, 2000);
        });
        assertEquals("Hoppsan, fel intervall angivet!", exception.getMessage());
    }

    @Test
    @DisplayName("countPrimeNumbers: Handles single-value range")
    public void countPrimeNumbersHandlesSingleValueRange() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        assertEquals(1, calculator.countPrimeNumbers(5, 5));
    }

    @Test
    @DisplayName("countPrimeNumbers: Handles full range")
    public void countPrimeNumbersHandlesFullRange() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        assertTrue(calculator.countPrimeNumbers(0, 1000) > 0);
    }

    @Test
    @DisplayName("printCount: Outputs correct message")
    public void printCountOutputsCorrectMessage() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        calculator.printCount(0, 10);
        assertTrue(outContent.toString().contains("Hej, det finns 4 primtal mellan 0 och 1000!"));
    }

    @Test
    @DisplayName("printSum: Outputs correct message")
    public void printSumOutputsCorrectMessage() {
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        calculator.printSum(0, 10);
        assertTrue(outContent.toString().contains("Och den totala summan av dessa primtal är 17."));
    }
}
