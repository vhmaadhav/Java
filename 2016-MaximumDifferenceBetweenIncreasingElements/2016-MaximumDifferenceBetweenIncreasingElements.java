// Last updated: 7/18/2026, 11:45:08 AM
1class Solution {
2    public int maximumDifference(int[] nums) {
3        
4        int n = nums.length;
5        
6        int max = -1;
7
8        for(int i=0; i<n; i++){
9            for(int j=0; j<n; j++){
10                if (nums[i] < nums[j] ){
11                    if(i<j){
12                        if( (nums[j]-nums[i]) > max){
13                        
14                        max = (nums[j]-nums[i]);
15                    
16                        }
17                    } 
18                }
19            }
20        }
21        return max;
22        
23    }
24}