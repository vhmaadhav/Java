// Last updated: 8/12/2026, 9:53:05 AM
1import java.util.HashMap;
2
3class Solution {
4    public int minOperations(int[] nums, int x) {
5
6        HashMap<Integer, Integer> hm = new HashMap<>();
7
8        int suffixSum = 0;
9
10        for (int i = 0; i < nums.length; i++) {
11            hm.put(suffixSum, i);
12            suffixSum += nums[nums.length - 1 - i];
13        }
14
15        hm.put(suffixSum, nums.length);
16
17        int operations = Integer.MAX_VALUE;
18        int prefixSum = 0;
19
20        for (int i = 0; i <= nums.length; i++) {
21
22            int neededSuffix = x - prefixSum;
23
24            if (hm.containsKey(neededSuffix)) {
25
26                int rightOperations = hm.get(neededSuffix);
27                int totalOperations = i + rightOperations;
28
29                if (totalOperations <= nums.length) {
30                    operations = Math.min(operations, totalOperations);
31                }
32            }
33
34            if (i < nums.length) {
35                prefixSum += nums[i];
36            }
37        }
38
39        return operations == Integer.MAX_VALUE ? -1 : operations;
40    }
41}