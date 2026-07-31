// Last updated: 7/31/2026, 12:19:45 PM
1
2
3public class Solution {
4
5  public List<List<Integer>> permute(int[] nums) {
6
7    List<List<Integer>> resultList = new ArrayList<>();
8
9    backtrack(resultList, new ArrayList<>(), nums);
10    return resultList;
11  }
12
13  private void backtrack(List<List<Integer>> resultList,
14                         ArrayList<Integer> tempList, int[] nums) {
15    if (tempList.size() == nums.length) {
16      resultList.add(new ArrayList<>(tempList));
17      return;
18    }
19
20    for (int number : nums) {
21      if (tempList.contains(number))
22        continue;
23      tempList.add(number);
24      backtrack(resultList, tempList, nums);
25      tempList.remove(tempList.size() - 1);
26    }
27  }
28
29}