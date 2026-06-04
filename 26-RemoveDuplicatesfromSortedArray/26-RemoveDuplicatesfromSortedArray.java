// Last updated: 6/4/2026, 7:24:25 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        for(int j=1;j<nums.length;j++){
5            if(nums[i]!=nums[j]){
6                nums[i+1] = nums[j];
7                i++;}
8        }
9        return i+1;
10    }
11}