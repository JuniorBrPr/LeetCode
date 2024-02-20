class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int j = k; j < nums.length; j++) {
            sum+= nums[j] - nums[j-k];
            maxSum = maxSum < sum ? sum : maxSum;
        }
        return maxSum/k;
    }
}