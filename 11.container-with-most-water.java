class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while (right > left){
            final int currArea = (right - left) * (height[right] > height[left] ? height[left] : height[right]);
            area = area < currArea ? currArea : area;
            if (height[right] > height[left]){
                left++;
            } else if (height[right] < height[left]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return area;
    }
}