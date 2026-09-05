// Title: Sqrt(x)
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/sqrt(x)/

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {

        long ans = 0;
                right = mid - 1;
            }
        }

        return (int) ans;
    }
}
