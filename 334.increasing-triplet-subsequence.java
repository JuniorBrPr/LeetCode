class Solution {
    public boolean increasingTriplet(int[] nums) {
        int minA = Integer.MIN_VALUE;
        int minB = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= minA) {
                minA = nums[i];
            } else if (nums[i] < minB) {
                minA = nums[i];
                minB = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}