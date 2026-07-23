// Last updated: 7/23/2026, 10:34:59 AM
1import java.util.HashMap;
2
3class Solution {
4
5    public int leastInterval(char[] tasks, int n) {
6
7        HashMap<Character, Integer> hm = new HashMap<>();
8
9        for (char ch : tasks) {
10            if (hm.containsKey(ch)) {
11                hm.put(ch, hm.get(ch) + 1);
12            } else {
13                hm.put(ch, 1);
14            }
15        }
16
17        int maxFreq = 0;
18        for (int val : hm.values()) {
19            maxFreq = Math.max(maxFreq, val);
20        }
21
22        int maxCount = 0;
23        for (int val : hm.values()) {
24            if (val == maxFreq) {
25                maxCount++;
26            }
27        }
28
29        int emptySlots = (maxFreq - 1) * (n - (maxCount - 1));
30        int availableTasks = tasks.length - maxFreq * maxCount;
31        int idles = Math.max(0, emptySlots - availableTasks);
32
33        return tasks.length + idles;
34    }
35}