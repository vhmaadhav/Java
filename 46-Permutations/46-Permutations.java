// Last updated: 7/31/2026, 12:22:12 PM
1public class Solution {
2
3  public List<List<Integer>> permute(int[] nums) {
4   List<List<Integer>> list = new ArrayList<>();
5   // Arrays.sort(nums); // not necessary
6   backtrack(list, new ArrayList<>(), nums);
7   return list;
8}
9
10private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
11   if(tempList.size() == nums.length){
12      list.add(new ArrayList<>(tempList));
13   } else{
14      for(int i = 0; i < nums.length; i++){ 
15         if(tempList.contains(nums[i])) continue; // element already exists, skip
16         tempList.add(nums[i]);
17         backtrack(list, tempList, nums);
18         tempList.remove(tempList.size() - 1);
19      }
20   }
21} 
22
23}