class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int j = k; j < nums.length; j++) {
            sum+= nums[j] - nums[j-k];
            if(sum < maxSum) continue;
            maxSum = sum;
        }
        return maxSum/k;
    }
}