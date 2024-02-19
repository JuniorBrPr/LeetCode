/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int mL = flowerbed.length - 2;
        for (int i = 0; i < (flowerbed.length > 2 ? flowerbed.length : 1); i++) {
            if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) &&
                    flowerbed[i] == 0) {
                n--;
                i++;
            }

            if (i < mL && flowerbed[i + 1] == 1) {
                i++;
            }
        }
        return n<=0;
    }
}
// @lc code=end

