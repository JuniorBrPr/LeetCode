class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numL = nums.length;
        int[] result = new int[numL];
        int currentSum = 1;
        for (int i = 0; i < numL; i++) {
            result[i] = currentSum;
            currentSum *= nums[i];
        }
        currentSum = 1;
        for (int i = numL - 1; i >= 0; i--) {
            result[i] *= currentSum;
            currentSum *= nums[i];
        }
        return result;
    }
}