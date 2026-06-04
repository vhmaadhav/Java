// Last updated: 6/4/2026, 7:25:09 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = 0;
        int maxsum = nums[0];
        for(int i =0; i<nums.length; i++){
            currentsum += nums[i];
            if(maxsum < currentsum){
                maxsum = currentsum;
            }
            if(currentsum < 0){
                currentsum = 0;
            }
            
        }
        return maxsum;
}}