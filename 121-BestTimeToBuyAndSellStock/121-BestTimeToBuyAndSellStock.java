// Last updated: 6/4/2026, 7:25:01 PM
class Solution {
    public int maxProfit(int[] prices) {
       int minprice = prices[0];
       int profit = 0;
       for(int i=1; i<prices.length; i++){
        if(minprice > prices[i]){
            minprice = prices[i];
        }
        if(profit < prices[i]-minprice){
            profit = prices[i] -  minprice;
        }
       }
       return profit;
    }
}