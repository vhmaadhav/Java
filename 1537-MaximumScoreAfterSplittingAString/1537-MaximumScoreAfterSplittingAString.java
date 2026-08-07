// Last updated: 8/7/2026, 11:27:06 AM
class Solution {
    public static int maxScore(String s) {
        int rightOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                rightOnes++;
            }
        }

        int leftZeros = 0;
        int maxScore = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }

            int currentScore = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }
}