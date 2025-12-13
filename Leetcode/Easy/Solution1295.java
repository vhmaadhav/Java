package Leetcode.Easy;

public class Solution1295 {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num: nums){
            if(String.valueOf(num).length()%2==0){
                count+=1;
            }
        }
        return count;
    }
}
