package edu.mills.cs180;

import static edu.mills.cs180.PalindromeChecker.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.*;

class PalindromeCheckerTest {

    @Test
    void test() {
        fail("Not yet implemented");
    }

    @Test
    void testIfStringsArePalindrome(String s) {

        assertTrue(isPalindrome(""));
        assertTrue(isPalindrome(""));
        assertTrue(isPalindrome(s));
    }

    @Test
    void testStringforInvalidInput(String s) {

        assertTrue(isPalindrome(""));
        assertTrue(isPalindrome(""));

        assertTrue(isPalindrome(s));
    }

}
