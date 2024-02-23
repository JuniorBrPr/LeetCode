class Solution {
    public int compress(char[] chars) {
        int length = 0;
        for (int i = 0; i < chars.length;) {
            final char currentChar = chars[i];
            int currAmount = 0;

            while (i < chars.length && chars[i] == currentChar) {
                currAmount++;
                i++;
            }

            chars[length++] = currentChar;

            if (currAmount > 1) {
                for (char c : String.valueOf(currAmount).toCharArray()){
                    chars[length++] = c;
                }
            }
        }
        return length;
    }
}
