import java.util.HashSet;
import java.util.List;
class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> characters = new HashSet<>(10){};
        characters.addAll(List.of('a','e','i','o','u','A','E','I','O','U'));
        char[] string = s.toCharArray();

        int begin = 0;
        int end = s.length() - 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (end <= begin) return new String(string);

            while(begin <= s.length() - 1 && !characters.contains(s.charAt(begin))){
                if (begin >= end) return new String(string);
                begin++;
            }

            while (end > 0 && !characters.contains(s.charAt(end))){
                if (end <= begin) return new String(string);
                end--;
            }

            char temp = s.charAt(begin);
            string[begin] = s.charAt(end);
            string[end] = temp;
            begin++;
            end--;
        }
        return new String(string);
    }
}
