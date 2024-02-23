class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while (right > left){
            final int rh = height[right];
            final int lh = height[left];
            final boolean lhIsGreaterOrEqual = rh <= lh;
            final int currArea = (right - left) * (lhIsGreaterOrEqual ? rh : lh);
            area = area < currArea ? currArea : area;
            if (lhIsGreaterOrEqual)right--;
            if (!lhIsGreaterOrEqual)left++;
        }
        return area;
    }
}