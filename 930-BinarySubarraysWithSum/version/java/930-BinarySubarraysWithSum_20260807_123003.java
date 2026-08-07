// Last updated: 8/7/2026, 12:30:03 PM
1import java.util.HashMap;
2
3class Solution {
4    public int numSubarraysWithSum(int[] nums, int goal) {
5        HashMap<Integer, Integer> hm = new HashMap<>();
6
7        int prefixSum = 0;
8        int count = 0;
9        hm.put(0, 1);
10        for (int n : nums) {
11            prefixSum += n;
12
13            if (hm.containsKey(prefixSum - goal)) {
14                count += hm.get(prefixSum - goal);
15            }
16
17            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);
18        }
19
20        return count;
21    }
22}