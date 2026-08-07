// Last updated: 8/7/2026, 10:17:25 AM
1class Solution {
2    public static int maxScore(String s) {
3        int maxSum = 0;
4
5        for (int i = 0; i < s.length() - 1; i++) {
6            String left = s.substring(0, i + 1);
7            String right = s.substring(i + 1);
8
9            int leftZeros = 0;
10            int rightOnes = 0;
11
12            for (char c : left.toCharArray()) {
13                if (c == '0') {
14                    leftZeros++;
15                }
16            }
17
18            for (char c : right.toCharArray()) {
19                if (c == '1') {
20                    rightOnes++;
21                }
22            }
23
24            int score = leftZeros + rightOnes;
25            maxSum = Math.max(maxSum, score);
26
27        }
28
29        return maxSum;
30    }
31}