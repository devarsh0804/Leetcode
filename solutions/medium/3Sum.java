// Title: 3Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/3sum/

            else if(sum>0){
                k--;
                j++;
            }
            if(sum<0){
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            int k=nums.length-1;
            int j=i+1;
                continue;
            }
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
