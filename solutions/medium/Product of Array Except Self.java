// Title: Product of Array Except Self
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        return ans;
        for(int i=nums.length-2;i>=0;i-- ){
        int suffix=1;
            suffix*=nums[i+1];
        }
    }
            ans[i]*=suffix;
}
