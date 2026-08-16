// Title: Matrix Block Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/matrix-block-sum/

                top++;
                bottom++;
                left++;
                right++;
                ans[i][j] = prefix[bottom][right]
                          - prefix[top - 1][right]
                          - prefix[bottom][left - 1]
                          + prefix[top - 1][left - 1];
            }
        }
        return ans;
    }
}
