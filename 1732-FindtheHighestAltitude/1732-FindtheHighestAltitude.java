// Last updated: 8/6/2026, 1:45:48 PM
1class Solution {
2    static int largestAltitude(int[] gain) {
3        int prefixSum = 0;
4        int max = 0;
5        int[] num = new int[gain.length+1];
6        num[0] = prefixSum;
7        for(int i=0; i<gain.length; i++){
8            prefixSum += gain[i];
9            num[i+1] = prefixSum;
10            if(num[i]>max){
11                max = num[i];
12            }
13            if(max < num[num.length-1]){
14                max =  num[num.length-1];
15            }
16        }
17
18
19        return max;
20    }
21}