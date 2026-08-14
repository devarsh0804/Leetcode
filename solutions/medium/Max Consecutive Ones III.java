// Title: Max Consecutive Ones III
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/max-consecutive-ones-iii/

        }
            }
            i++;
        if(zeros<=k){
            int length=j-i+1;
       int i=0,j=0;
       int zeros=0;
       while(j<nums.length){
        if(nums[j]==0){
            zeros++;
        }
        while(zeros>k){
            if(nums[i]==0){
                zeros--;
class Solution {
    public int longestOnes(int[] nums, int k) {
       int maxlength=0;
