// Last updated: 7/18/2026, 11:58:22 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int[] arr = new int[256];
4
5        char[] ch1 = s.toCharArray();
6        char[] ch2 = t.toCharArray();
7
8        if (s.length() != t.length()) {
9            return false;
10        }
11        else{
12        
13            for(char ch: ch1){
14            arr[ch]++;
15            }
16            for(char ch: ch2){
17            arr[ch]--;
18            }
19            for (int count : arr) {
20            if (count != 0) {
21                return false;
22            }
23            }
24            return true;
25        }
26    }    
27}