package Leetcode.Easy;

    class Solution1672 {
        public int maximumWealth(int[][] accounts) {
            int maxWealth = 0;

            // 1. "account" represents one row (one customer)
            for (int[] account : accounts) {

                // Reset the bucket for this new customer!
                int currentSum = 0;

                // 2. "money" represents the value in each column
                for (int money : account) {
                    currentSum += money;
                }

                // 3. Check if this customer is the richest
                if (currentSum > maxWealth) {
                    maxWealth = currentSum;
                }
            }

            return maxWealth;
        }
    }