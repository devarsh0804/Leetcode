// Title: Find Missing and Repeated Values
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-missing-and-repeated-values/

        for(int i=1;i<=grid.length*grid.length;i++){
            if (mp.getOrDefault(i, 0) == 2) {
                ans[0] = i;      
            }

            if (mp.getOrDefault(i, 0) == 0) {
                ans[1] = i;       
            }
        int[] ans=new int[2];
        }
                mp.put(grid[i][j],mp.getOrDefault(grid[i][j],0)+1);
            }
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
