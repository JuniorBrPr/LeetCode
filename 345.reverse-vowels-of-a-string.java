import java.util.HashSet;
import java.util.List;
class Solution {
    public String reverseVowels(String s) {
        String characters = "aeiouAEIOU";
        char[] string = s.toCharArray();
        int begin = 0;
        int end = s.length() - 1;
        while(begin < end) {
            while(begin < end && characters.indexOf(string[begin]) < 0){
                begin++;
            }

            while (end > begin && characters.indexOf(string[end]) < 0){
                end--;
            }

            char temp = string[begin];
            string[begin] = string[end];
            string[end] = temp;
            begin++;
            end--;
        }
        return new String(string);
    }
}
