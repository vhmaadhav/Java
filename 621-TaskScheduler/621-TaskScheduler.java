// Last updated: 7/23/2026, 10:32:01 AM
1class Solution {
2
3    public int leastInterval(char[] tasks, int n) {
4
5        int[] freq = new int[26];
6        for (char ch : tasks) {
7            freq[ch - 'A']++;
8        }
9
10        int time = 0;
11
12        while (true) {
13
14            boolean[] used = new boolean[26];
15            for (int i = 0; i <= n; i++) {
16
17                int best = -1;
18                for (int j = 0; j < 26; j++) {
19                    if (freq[j] > 0 &&
20                        !used[j] &&
21                        (best == -1 || freq[j] > freq[best])) {
22                        best = j;
23                    }
24                }
25                if (best != -1) {
26                    freq[best]--;
27                    used[best] = true;
28                }
29
30                time++;
31                boolean done = true;
32                for (int j = 0; j < 26; j++) {
33                    if (freq[j] > 0) {
34                        done = false;
35                        break;
36                    }
37                }
38
39                if (done) {
40                    return time;
41                }
42            }
43        }
44    }
45}