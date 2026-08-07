// Last updated: 8/7/2026, 2:02:13 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] == 0) {
6                nums[i] = -1;
7            }
8        }
9
10        HashMap<Integer, Integer> hm = new HashMap<>();
11
12        int prefixSum = 0;
13        int max = 0;
14
15        hm.put(0, -1);
16
17        for (int i = 0; i < nums.length; i++) {
18            prefixSum += nums[i];
19
20            if (hm.containsKey(prefixSum)) {
21                int len = i - hm.get(prefixSum);
22                max = Math.max(max, len);
23            } else {
24                hm.put(prefixSum, i);
25            }
26        }
27
28        return max;
29    }
30}