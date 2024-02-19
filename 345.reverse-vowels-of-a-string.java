import java.util.HashSet;
import java.util.List;
class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> characters = new HashSet<>(10){};
        characters.addAll(List.of('a','e','i','o','u','A','E','I','O','U'));
        char[] string = s.toCharArray();

        int begin = 0;
        int end = s.length() - 1;
        while(begin < end) {
            while(begin < end && !characters.contains(string[begin])){
                begin++;
            }

            while (end > begin && !characters.contains(string[end])){
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
