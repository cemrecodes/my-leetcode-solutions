class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int profit = 0;
        int len = prices.length;
        
        while(right < len){
            if(prices[right] - prices[left] < 0){
                left = right;
            }
            else if(profit < prices[right]-prices[left] ){
                profit = prices[right]-prices[left];
            }
            right += 1;
        }

        return profit;
    }
}