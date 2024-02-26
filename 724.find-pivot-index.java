class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums)
            totalSum += num;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (totalSum - (currentSum * 2) == nums[i]) {
                return i;
            }
            currentSum += nums[i];
        }
        return -1;
    }
}