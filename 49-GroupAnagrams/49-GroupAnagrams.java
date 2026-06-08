// Last updated: 6/8/2026, 9:44:46 PM
1// Last updated: 6/4/2026, 7:25:11 PM
2class Solution {
3    public List<List<String>> groupAnagrams(String[] strs) {
4        if (strs == null || strs.length == 0) {
5            return new ArrayList<>();
6        }
7        Map<String, List<String>> frequencystringsmap = new HashMap<>();
8        for (String str : strs) {
9            String frequencystring = getFrequencyString(str);
10            if (frequencystringsmap.containsKey(frequencystring)) {
11                frequencystringsmap.get(frequencystring).add(str);
12            } else {
13                List<String> strlist = new ArrayList<>();
14                strlist.add(str);
15                frequencystringsmap.put(frequencystring, strlist);
16            }
17        }
18        return new ArrayList<>(frequencystringsmap.values());
19    }
20
21    private String getFrequencyString(String str) {
22        int[] freq = new int[26];
23        for (char ch : str.toCharArray()) {
24            freq[ch - 'a']++;
25        }
26        StringBuilder sb = new StringBuilder();
27        for (int i = 0; i < 26; i++) {
28            sb.append('#');
29            sb.append(freq[i]);
30        }
31        return sb.toString();
32    }
33}