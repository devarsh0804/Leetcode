// Title: Plus One
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/plus-one/

                return digits;
            }

            digits[i] = 0;
        }

        // All digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
