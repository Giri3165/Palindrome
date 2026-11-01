package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testPalindromeNumber() {
        assertTrue(Main.isPalindrome(121));
    }

    @Test
    public void testNonPalindromeNumber() {
        assertFalse(Main.isPalindrome(123));
    }

    @Test
    public void testSingleDigitNumber() {
        assertTrue(Main.isPalindrome(7));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(Main.isPalindrome(-121));
    }
}