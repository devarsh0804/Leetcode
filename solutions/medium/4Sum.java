// Title: 4Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/4sum/

                }
                int k=j+1;
                int l=n-1;
                while(k<l){
                long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
