// Last updated: 8/7/2026, 2:16:45 PM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        HashMap<Integer, Integer> hm = new HashMap<>();
4
5        hm.put(0, 1);
6
7        int prefixSum = 0;
8        int count = 0;
9
10        for (int num : nums) {
11            prefixSum += num;
12
13            int remainder = prefixSum % k;
14
15            if (remainder < 0) {
16                remainder += k;
17            }
18
19            if (hm.containsKey(remainder)) {
20                count += hm.get(remainder);
21            }
22
23            hm.put(remainder, hm.getOrDefault(remainder, 0) + 1);
24        }
25
26        return count;
27    }
28}