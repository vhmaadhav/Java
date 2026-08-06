// Last updated: 8/6/2026, 2:51:28 PM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int[] leftSum = new int[n];
5        int[] rightSum = new int[n];
6
7        int prefixSum = 0;
8        for(int i=0; i<n; i++){
9            leftSum[i] = prefixSum;
10            prefixSum += nums[i];
11        }
12
13        int suffixSum = 0;
14        for(int i=n-1; i>=0; i--){
15            rightSum[i] = suffixSum;
16            suffixSum += nums[i];
17        }
18
19        for(int i=0; i<n; i++){
20            nums[i] = Math.abs(rightSum[i] - leftSum[i]);
21        }
22
23        return nums;
24    }
25}