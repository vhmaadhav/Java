// Last updated: 8/7/2026, 12:17:36 PM
1import java.util.HashMap;
2
3class Solution {
4    public int subarraySum(int[] nums, int k) {
5        HashMap<Integer, Integer> hm = new HashMap<>();
6        hm.put(0, 1);
7
8        int prefixSum = 0;
9        int count = 0;
10
11        for (int num : nums) {
12            prefixSum += num;
13            if (hm.containsKey(prefixSum - k)) {
14                count += hm.get(prefixSum - k);
15            }
16            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);
17        }
18
19        return count;
20    }
21}