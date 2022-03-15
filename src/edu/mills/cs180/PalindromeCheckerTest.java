package edu.mills.cs180;

import static edu.mills.cs180.PalindromeChecker.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class PalindromeCheckerTest {

    @ParameterizedTest
    @ValueSource(strings = {"AMA", "racecar", "x"})
    void testIfPalindrome(String s) {
        assertTrue(isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"spatula", "Java", "abc"})
    void testforInvalidStrings(String s) {
        assertTrue(isPalindrome(s));
    }
}
