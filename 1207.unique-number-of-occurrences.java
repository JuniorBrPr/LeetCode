import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> numsSeen = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            numsSeen.put(arr[i], numsSeen.getOrDefault(arr[i], 0) + 1);
        }
        HashSet<Integer> tracker = new HashSet<>();
        for (Integer num : numsSeen.values()) {
            if (tracker.contains(num)) {
                return false;
            } else {
                tracker.add(num);
            }
        }
        return true;
    }
}