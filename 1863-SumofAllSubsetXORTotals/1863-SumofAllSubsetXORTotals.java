// Last updated: 7/31/2026, 10:02:00 AM
1class Solution {
2
3    public int subsetXORSum(int[] nums) {
4        return solve(nums, 0, 0);
5    }
6
7    public int solve(int[] nums, int index, int xor) {
8        if (index == nums.length) {
9            return xor;
10        }
11        int take = solve(nums, index + 1, xor ^ nums[index]);
12        int notTake = solve(nums, index + 1, xor);
13
14        return take + notTake;
15    }
16}