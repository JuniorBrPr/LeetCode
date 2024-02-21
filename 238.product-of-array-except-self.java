class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int currentSum = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = currentSum;
            currentSum *= nums[i];
        }
        currentSum = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= currentSum;
            currentSum *= nums[i];
        }
        return result;
    }
}