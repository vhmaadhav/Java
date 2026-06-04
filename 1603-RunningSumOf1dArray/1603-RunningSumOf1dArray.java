// Last updated: 6/4/2026, 7:24:24 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum[] = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            runningSum[i] = runningSum[i-1]+nums[i];

        }
        return runningSum;
    }
}