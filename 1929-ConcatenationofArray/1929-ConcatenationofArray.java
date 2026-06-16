// Last updated: 6/16/2026, 9:14:20 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] ans = new int[2 * nums.length];
4
5        for (int i = 0; i < nums.length; i++) {
6            ans[i] = nums[i];
7            ans[i + nums.length] = nums[i];
8        }
9
10        return ans;
11    }
12}