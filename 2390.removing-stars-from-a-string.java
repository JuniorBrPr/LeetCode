import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        char[] sArray = s.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        for (char c : sArray) {
            if (c == '*') {
                characterStack.pop();
            } else {
                characterStack.push(c);
            }
        }
        char[] rArray = new char[characterStack.size()];
        for (int i = characterStack.size() - 1; i >= 0 ; i--) {
            rArray[i] = characterStack.pop();
        }
        return String.valueOf(rArray);
    }
}

