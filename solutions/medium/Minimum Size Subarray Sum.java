// Title: Minimum Size Subarray Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-size-subarray-sum/

        }
            }
                sum -= nums[i];

                i++;
            j++;
            sum+=nums[j];
            while(sum>=target){
                int length=j-i+1;
                minlength=Math.min(length,minlength);

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;
        while(j<nums.length){
