/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().orElse(0);
        return Arrays.stream(candies).mapToObj(i -> i + extraCandies >= max ).toList();
    }
}
// @lc code=end

