// Title: Subarray Sum Equals K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-sum-equals-k/

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
        }
    }
            int remove=prefix-k;
        int count=0;
            count += map.getOrDefault(remove, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        return count;
}
    public int subarraySum(int[] nums, int k) {
class Solution {
