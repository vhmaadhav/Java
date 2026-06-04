// Last updated: 6/4/2026, 7:24:18 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        // 1. Create a new array that is double the size of the original
        int[] ans = new int[2 * n];
        
        // 2. Loop through the original array
        for (int i = 0; i < n; i++) {
            // 3. Assign the element to the first half
            ans[i] = nums[i];
            // 4. Assign the same element to the second half (offset by n)
            ans[i + n] = nums[i];
        }
        
        return ans;
    }
}