// Last updated: 8/6/2026, 12:55:49 PM
1class Solution {
2    static int largestAltitude(int[] gain) {
3        int prefixSum = 0;
4        int[] num = new int[gain.length+1];
5        num[0] = prefixSum;
6        for(int i=0; i<gain.length; i++){
7            prefixSum += gain[i];
8            num[i+1] = prefixSum;
9//            if(num[i]>max){
10//                max = num[i];
11//            }
12        }
13        Arrays.sort(num);
14        int max = num[num.length-1];
15
16
17        return max;
18    }
19}