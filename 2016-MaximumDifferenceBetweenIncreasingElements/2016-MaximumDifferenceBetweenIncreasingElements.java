// Last updated: 7/18/2026, 11:48:15 AM
1class Solution {
2    public int maximumDifference(int[] nums) {
3        int min = nums[0];
4        int ans = -1;
5
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] > min) {
8                ans = Math.max(ans, nums[i] - min);
9            } else {
10                min = nums[i];
11            }
12        }
13
14        return ans;
15    }
16}