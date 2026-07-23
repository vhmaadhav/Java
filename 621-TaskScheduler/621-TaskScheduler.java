// Last updated: 7/23/2026, 10:38:00 AM
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        int maxFreq = 0;
4        int[] freq = new int[26];
5        
6        for(char t : tasks){
7            freq[t - 'A']++;
8        }
9        
10        for(int f : freq){
11            maxFreq = Math.max(maxFreq, f);
12        }
13        
14        int countMax = 0;
15        
16        for(int f : freq){
17            if(f == maxFreq) countMax++;
18        }
19        
20        int parts = (maxFreq - 1) * (n+1) + countMax;
21
22        return Math.max(parts, tasks.length);
23    }
24}