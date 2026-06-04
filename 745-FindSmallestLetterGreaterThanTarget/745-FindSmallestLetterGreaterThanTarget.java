// Last updated: 6/4/2026, 7:24:38 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (letters[mid] > target) {
                end = mid - 1;
            } else { 
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}