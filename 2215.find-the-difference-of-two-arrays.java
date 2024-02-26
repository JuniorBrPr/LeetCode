import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> num1Set = new HashSet<>();
        for (int num : nums1)
            num1Set.add(num);
        HashSet<Integer> num2Set = new HashSet<>();
        for (int num : nums2)
            num2Set.add(num);

        List<List<Integer>> resutList = new ArrayList<>(2);
        resutList.add(new ArrayList<Integer>());
        resutList.add(new ArrayList<Integer>());

        for (Integer num : num1Set) {
            if (!num2Set.contains(num)) {
                resutList.get(0).add(num);
            }
        }
        for (Integer num : num2Set) {
            if (!num1Set.contains(num)) {
                resutList.get(1).add(num);
            }
        }
        return resutList;
    }
}