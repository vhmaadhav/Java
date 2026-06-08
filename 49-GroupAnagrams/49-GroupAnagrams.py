# Last updated: 6/8/2026, 9:43:44 PM
1class Solution:
2  def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
3    sMap = defaultdict(list)
4
5    for s in strs:
6      sorted_s = "".join(sorted(s))
7      sMap[sorted_s].append(s)
8    
9    return list(sMap.values())