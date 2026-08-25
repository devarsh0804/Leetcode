// Title: Palindromic Substrings
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/palindromic-substrings/


        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
        }
        return count;
    }
        public boolean isPalindrome(String s, int left, int right) {
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    count++;
                }
            }
class Solution {
    public int countSubstrings(String s) {
        int count=0;
