// Title: Subarray Sums Divisible by K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-sums-divisible-by-k/

            if (rem < 0) {
                rem += k;
            }

            // If remainder already exists
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            // Increase frequency
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
