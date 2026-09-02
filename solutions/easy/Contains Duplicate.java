// Title: Contains Duplicate
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/contains-duplicate/


        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    public boolean containsDuplicate(int[] nums) {
class Solution {
import java.util.HashSet;

