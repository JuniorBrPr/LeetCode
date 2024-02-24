import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        for (int num : nums) {
            int currentCount = numCount.computeIfAbsent(num, count -> count = 0);
            numCount.replace(num, currentCount + 1);
        }
        int operations = 0;
        for (Integer key : numCount.keySet()) {
            int buddyKey = k - key;
            if (buddyKey != key && numCount.containsKey(buddyKey)){
                int buddyCount = numCount.get(buddyKey);
                int currentNumCount = numCount.get(key);
                while (currentNumCount > 0 && buddyCount > 0) {
                    operations++;
                    --buddyCount;
                    --currentNumCount;
                }
                numCount.replace(key, currentNumCount);
                numCount.replace(buddyKey, buddyCount);
            } else if (buddyKey == key){
                int currentNumCount = numCount.get(key);
                while (currentNumCount > 1) {
                    operations++;
                    currentNumCount -= 2;
                }
                numCount.replace(key, currentNumCount);
            }
        }
        return operations;
    }
}