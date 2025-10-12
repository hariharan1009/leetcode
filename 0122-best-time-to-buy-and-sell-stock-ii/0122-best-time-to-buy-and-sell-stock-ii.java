class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=0;
        int sell=0;
        for(int i=0;i<n-1;i++){
            if(prices[i]<prices[i+1]){
                buy=prices[i];
                while((i<n-1) && prices[i]<=prices[i+1]){
                    i++;
                }
                sell+=prices[i]-buy;
            }
        }
        return sell;
    }
}