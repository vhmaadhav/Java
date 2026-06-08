// Last updated: 6/8/2026, 9:01:47 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3       char[] snew = s.toCharArray();
4       char[] tnew = t.toCharArray();
5        Arrays.sort(snew);
6        Arrays.sort(tnew);
7       return Arrays.equals(snew,tnew);
8    }
9    
10}