// Title: Find Pivot Index
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-pivot-index/

        for (int i = 0; i < n; i++) {

        }


            int leftSum = prefix[i] - nums[i];

            int rightSum = prefix[n - 1] - prefix[i];

            if (leftSum == rightSum) {

                return i;

            }

        }

        return -1;
