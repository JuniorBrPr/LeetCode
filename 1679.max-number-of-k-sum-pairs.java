import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        int operations = 0;
        for (int num : nums) {
            if (numCount.containsKey(k - num) && numCount.get(k - num) > 0) {
                operations++;
                numCount.put(k - num, numCount.get(k - num) - 1);
            } else {
                numCount.put(num, numCount.getOrDefault(num, 0) + 1);
            }
        }
        return operations;
    }
}