/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i < flowerbed.length - 1 && flowerbed[i + 1] == 1){
                i+=2;
                continue;
            }
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0) {
                n--;
                if (n == 0) return true;
                i++;
            }
        }
        return false;
    }
}
// @lc code=end

