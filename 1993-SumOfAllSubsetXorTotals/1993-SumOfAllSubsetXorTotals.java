// Last updated: 8/7/2026, 11:26:51 AM
class Solution {

    public int subsetXORSum(int[] nums) {
        return solve(nums, 0, 0);
    }

    public int solve(int[] nums, int index, int xor) {
        if (index == nums.length) {
            return xor;
        }
        int take = solve(nums, index + 1, xor ^ nums[index]);
        int notTake = solve(nums, index + 1, xor);

        return take + notTake;
    }
}