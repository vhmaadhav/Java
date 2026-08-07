// Last updated: 8/7/2026, 11:25:18 AM
1class Solution {
2    public int waysToSplitArray(int[] nums) {
3        long total = 0;
4
5        for (int num : nums) {
6            total += num;
7        }
8
9        long leftSum = 0;
10        int count = 0;
11
12        for (int i = 0; i < nums.length - 1; i++) {
13            leftSum += nums[i];
14
15            long rightSum = total - leftSum;
16
17            if (leftSum >= rightSum) {
18                count++;
19            }
20        }
21
22        return count;
23    }
24}