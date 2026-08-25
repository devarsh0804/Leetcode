// Title: Valid Palindrome II
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-palindrome-ii/

                       isPalindrome(s, left, right - 1);
            }
            else {
                // Delete left character OR delete right character
                return isPalindrome(s, left + 1, right) ||
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } 

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

class Solution {
