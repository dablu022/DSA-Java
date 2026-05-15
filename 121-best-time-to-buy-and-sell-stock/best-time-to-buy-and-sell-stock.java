class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int currentp=prices[0];
        int n=prices.length;
        for(int i=0;i<n;i++){
            currentp =Math.min(prices[i] , currentp);
            int profit=prices[i] -currentp;
            maxp=Math.max(profit ,maxp);
        }
        return maxp;

    }
}