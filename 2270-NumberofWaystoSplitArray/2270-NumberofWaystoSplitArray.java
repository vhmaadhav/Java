// Last updated: 8/7/2026, 11:22:32 AM
1class Solution {
2    public int waysToSplitArray(int[] nums) {
3        long count = 0;
4        long left = 0;
5        long total = 0;
6        for(int n: nums){
7            total += n;
8        }
9        for(int i=0; i<nums.length-1; i++){
10            left += nums[i];
11            if(left>=(total-left)){
12                count++;
13            }
14
15        }
16        return (int) count;
17    }
18}