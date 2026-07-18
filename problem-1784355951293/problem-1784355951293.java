// Last updated: 7/18/2026, 11:55:51 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int[] arr = new int[256];
4
5        char[] ch1 = s.toCharArray();
6        char[] ch2 = t.toCharArray();
7
8        for(char ch: ch1){
9            arr[ch]++;
10        }
11        for(char ch: ch2){
12            arr[ch]--;
13        }
14        for (int count : arr) {
15            if (count != 0) {
16                return false;
17            }
18        }
19        return true;
20    }
21}