class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minsofor=prices[0];

        for(int i=1;i<prices.length;i++){
            int currentprice=prices[i];
            minsofor=Math.min(minsofor,currentprice);
            maxprofit=Math.max(maxprofit,currentprice-minsofor);
        }
        return maxprofit;
    }
}