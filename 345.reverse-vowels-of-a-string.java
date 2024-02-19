/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

import java.util.regex.Pattern;

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int begin = 0;
        int end = s.length() - 1;
        Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        char[] string = s.toCharArray();

        for (int i = 0; i < s.length() - 1; i++) {
            if (end <= begin) return new String(string);
            while(begin < s.length() - 1 && !pattern.matcher(s.subSequence(begin, begin + 1)).find()){
                if (begin > end) return new String(string);
                begin++;
            }

            while (end > 0 && !pattern.matcher(s.subSequence(end, end + 1)).find()){
                if (end < begin) return new String(string);
                end--;
            }

            if (!pattern.matcher(s.subSequence(begin, begin + 1)).find()
                    || !pattern.matcher(s.subSequence(end, end + 1)).find()) return new String(string);
            char temp = s.charAt(begin);
            string[begin] = s.charAt(end);
            string[end] = temp;
            begin++;
            end--;
        }
        return new String(string);
    }
}
// @lc code=end

