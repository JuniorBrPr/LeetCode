import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String frequencySort(String s) {
          HashMap<Character, Integer> map = new HashMap<>();
          for (char c : s.toCharArray()) {
              map.put(c, map.getOrDefault(c, 0) + 1);
          }
          StringBuilder sb = new StringBuilder();
          map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).forEach(e -> {
              char[] arr = new char[e.getValue()];
              Arrays.fill(arr, e.getKey());
                sb.append(arr);
          });
          return sb.toString();
      }
  }

