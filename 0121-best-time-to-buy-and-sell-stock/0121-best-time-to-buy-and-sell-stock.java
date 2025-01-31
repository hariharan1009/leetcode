class Solution {
    public int maxProfit(int[] prices) {
        int x=prices[0];
        int y=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<x){
                x=prices[i];
            }
            else{
                y=Math.max(y,prices[i]-x);
            }
        }
        return y;
    }
}