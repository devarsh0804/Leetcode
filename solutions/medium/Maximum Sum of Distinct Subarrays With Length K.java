// Title: Maximum Sum of Distinct Subarrays With Length K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/

            else {

                if (map.size() == k) {
                    max = Math.max(max, sum);
                }

                map.put(nums[i], map.get(nums[i]) - 1);

                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }

                sum -= nums[i];

            }
                j++;
            if (j - i + 1 < k) {
