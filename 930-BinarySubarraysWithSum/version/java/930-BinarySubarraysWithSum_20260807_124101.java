// Last updated: 8/7/2026, 12:41:01 PM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        for(int i=0; i<nums.length; i++){
4            if(nums[i]%2==0){
5                nums[i] = 0;
6            }
7            else{
8                nums[i] = 1;
9            }
10        }
11        HashMap<Integer, Integer> hm = new HashMap<>();
12
13        int prefixSum = 0;
14        int count = 0;
15        hm.put(0, 1);
16        for (int n : nums) {
17            prefixSum += n;
18
19            if (hm.containsKey(prefixSum - k)) {
20                count += hm.get(prefixSum - k);
21            }
22
23            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);
24        }
25
26        return count;
27
28    }
29}