// Last updated: 8/6/2026, 2:28:45 PM
1class Solution {
2    public int findMiddleIndex(int[] nums) {
3        int n = nums.length;
4
5        for (int i = 0; i < n; i++) {
6            int leftSum = prefixSum(nums, i);
7            int rightSum = SuffixSum(nums, i);
8
9            if (rightSum == leftSum) {
10                return i; 
11            }
12        }
13        return -1;
14
15    }
16    public int prefixSum(int[] nums, int index) {
17        int sum = 0;
18        for (int i = 0; i < index; i++) {
19            sum += nums[i];
20        }
21        return sum;
22    }
23
24    public int SuffixSum(int[] nums, int index) {
25        int sum = 0;
26        for (int i = nums.length - 1; i > index; i--) {
27            sum += nums[i];
28        }
29        return sum;
30    }
31}