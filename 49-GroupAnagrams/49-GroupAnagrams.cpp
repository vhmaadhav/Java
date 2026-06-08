// Last updated: 6/8/2026, 9:47:40 PM
1class Solution {
2public:
3    vector<vector<string>> groupAnagrams(vector<string>& strs) {
4        unordered_map<string, vector<string>> ans;
5
6        for (string& s : strs) {
7            string key = s;
8            sort(key.begin(), key.end());
9            ans[key].push_back(s);
10        }
11
12        vector<vector<string>> result;
13        for (auto& entry : ans) {
14            result.push_back(entry.second);
15        }
16
17        return result;        
18    }
19};