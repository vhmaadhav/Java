// Last updated: 6/8/2026, 8:52:21 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if(strs.length==0) {return "";}
4        String prefix = strs[0];
5        for(int i=1;i<strs.length;i++){
6            while(strs[i].indexOf(prefix)!=0){
7                prefix = prefix.substring(0,prefix.length()-1);
8            }
9        }
10        return prefix;
11    }
12}