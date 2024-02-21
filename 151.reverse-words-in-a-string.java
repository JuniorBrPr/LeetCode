class Solution {
    public String reverseWords(String s) {
        String[] strings = s.trim().split("\\s+");
        int index = 0;
        for (int i = strings.length - 1; i >= 0 ; i--) {
            String temp = strings[i].intern();
            strings[i] = strings[index];
            strings[index] = temp;
            index++;
            if(index >=i) break;
        }
        return String.join(" ", strings);
    }
}