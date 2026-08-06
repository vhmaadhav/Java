// Last updated: 8/6/2026, 12:06:08 PM
1class NumArray {
2    private int[] prefix;
3    public NumArray(int[] nums) {
4        for(int i=1; i<nums.length; i++){
5            nums[i] = nums[i-1] + nums[i];
6        }
7        this.prefix = nums;
8    }
9    
10    public int sumRange(int left, int right) {
11        if(left==0){
12            return prefix[right];
13        }
14        else{
15            return prefix[right] - prefix[left-1];
16        }
17    }
18}
19
20/**
21 * Your NumArray object will be instantiated and called as such:
22 * NumArray obj = new NumArray(nums);
23 * int param_1 = obj.sumRange(left,right);
24 */