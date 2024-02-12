/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i : candies) {
            max = Math.max(i, max);
        }
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int i : candies) {
            result.add(i + extraCandies >= max);
        }
        return result;
    }
}
// @lc code=end

