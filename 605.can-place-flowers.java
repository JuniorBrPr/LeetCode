/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        int flowers = 0;
        int maxIndex = flowerbed.length - 2;

        for (int i = 0; i < flowerbed.length; ) {
            if (flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) && (i == 0 || flowerbed[i - 1] == 0)) {
                flowers++;
                if (i == maxIndex) {
                    break;
                }
                i += 2;
                continue;
            } else {
                if (i < maxIndex && flowerbed[i + 1] == 1) {
                    i += 2;
                    continue;
                }
            }
            i++;
        }
        return flowers >= n;
    }
}
// @lc code=end

