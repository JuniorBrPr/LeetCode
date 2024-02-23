class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while (right > left){
            final int rh = height[right];
            final int lh = height[left];
            final int currArea = (right - left) * (rh < lh ? rh : lh);
            area = area < currArea ? currArea : area;
            if (rh <= lh)right--;
            if (lh <= rh)left++;
        }
        return area;
    }
}