class Solution {
    public String reverseWords(String s) {
        String[] strings = s.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strings.length - 1; i >= 0 ; i--) {
            stringBuilder.append(strings[i]);
            if (i > 0) stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}