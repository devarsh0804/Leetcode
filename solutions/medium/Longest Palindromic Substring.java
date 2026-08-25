// Title: Longest Palindromic Substring
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-palindromic-substring/


            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int len1 = expand(s, i, i);

            // Even length palindrome
class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
