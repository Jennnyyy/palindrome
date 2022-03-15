package edu.mills.cs180;

/**
 * A static utility class for testing whether strings are palindromes.
 *
 * @author Ellen Spertus
 * @author Jennifer Flores
 */
public class PalindromeChecker {
    private PalindromeChecker() {}

    /**
     * Checks whether the given string is a palindrome. A string is considered a palindrome if it
     * reads the same forwards and backwards once all non-alphanumeric characters are removed.
     *
     * @param s the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {

        String sb = new StringBuilder(s).toString();

        String reverse = sb.toString();

        if (s.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
