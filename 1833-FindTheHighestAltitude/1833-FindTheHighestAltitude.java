// Last updated: 8/7/2026, 11:26:56 AM
class Solution {
    static int largestAltitude(int[] gain) {
        int prefixSum = 0;
        int max = 0;
        int[] num = new int[gain.length+1];
        num[0] = prefixSum;
        for(int i=0; i<gain.length; i++){
            prefixSum += gain[i];
            num[i+1] = prefixSum;
            if(num[i]>max){
                max = num[i];
            }
            if(max < num[num.length-1]){
                max =  num[num.length-1];
            }
        }


        return max;
    }
}