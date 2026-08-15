// Title: Fruit Into Baskets
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/fruit-into-baskets/

            map.put(fruits[i], map.get(fruits[i]) - 1);

                if (map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]);
                }
        }
                i++;
        while(map.size()>2){
        
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
        {
         for (int j = 0; j < fruits.length; j++)
        Map<Integer, Integer> map = new HashMap<>();
        int maxlength=0;
    public int totalFruit(int[] fruits) {
        int i=0;
class Solution {
