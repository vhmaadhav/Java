// Last updated: 8/7/2026, 10:19:21 AM
1class Solution {
2    public static int maxScore(String s) {
3        int rightOnes = 0;
4
5        for (char c : s.toCharArray()) {
6            if (c == '1') {
7                rightOnes++;
8            }
9        }
10
11        int leftZeros = 0;
12        int maxScore = 0;
13
14        for (int i = 0; i < s.length() - 1; i++) {
15            if (s.charAt(i) == '0') {
16                leftZeros++;
17            } else {
18                rightOnes--;
19            }
20
21            int currentScore = leftZeros + rightOnes;
22            maxScore = Math.max(maxScore, currentScore);
23        }
24
25        return maxScore;
26    }
27}