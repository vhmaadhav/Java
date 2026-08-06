// Last updated: 8/6/2026, 1:58:20 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3     int leftSum = 0;
4     int rightSum = 0;
5     for(int i=0; i<nums.length; i++){
6        if(i==0){
7            leftSum = 0;
8        }
9        else if(i==nums.length-1){
10            rightSum = 0;
11        }
12        leftSum = findSum(nums, 0, i);
13        rightSum = findSum(nums,i+1,nums.length);
14        if(leftSum == rightSum){
15            return i;
16        }
17     }
18     return -1;
19
20      
21    }
22    public int findSum(int[] nums, int left, int right){
23        int sum = 0;
24        for(int i=left; i<right; i++){
25            sum += nums[i];
26        }
27        return sum;
28     }  
29}