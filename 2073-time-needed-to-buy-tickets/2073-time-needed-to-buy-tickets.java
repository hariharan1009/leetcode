class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int ans=0;
        while(t[k]>0){
            for(int i=0;i<t.length;i++){
                if(t[i]!=0){
                    t[i]--;
                    ans++;
                }
                if(t[k]==0){
                    return ans;
                }
            }
        }
        return ans;
    }
}