class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int largest = current;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            if (current > largest)
                largest = current;
        }
        return largest;
    }
}