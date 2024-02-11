class Solution {
    public String gcdOfStrings(String str1, String str2) {
        return str1.concat(str2).equals(str2.concat(str1)) ? str1.substring(0,greatesCommonDivider(str1.length(), str2.length())) : "";
    }

    private int greatesCommonDivider(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatesCommonDivider(b, a % b);
    }
}
