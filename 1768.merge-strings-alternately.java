class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int minLength = Integer.min(word1.length(), word2.length());
        for (int i = 0; i < minLength; i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        if (word1.length() != word2.length()){
            sb.append(word1.length() > word2.length() ? word1.substring(minLength, word1.length()) : word2.substring(minLength, word2.length()));
        }
        return sb.toString();
    }
}
