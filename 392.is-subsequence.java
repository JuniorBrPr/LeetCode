class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int sIndex = 0;
        int tIndex = 0;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int sLength = s.length();
        int tLength = t.length();
        while (tIndex < tLength){
            if (sArr[sIndex] == tArr[tIndex]){
                sIndex++;
                if (sIndex == sLength) return true;
            }
            tIndex++;
        }
        return false;
    }
}