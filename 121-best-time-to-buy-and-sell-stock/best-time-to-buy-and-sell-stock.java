class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],ans=0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            ans=Math.max(ans,prices[i]-buy);
        }
        return ans;
    }
}