class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int s=0;
        int b=0;
        for(int i=0;i<n-1;i++){
            if(p[i]<p[i+1]){
               b=p[i]; 
               while((i<n-1) && p[i]<=p[i+1]){
                i++;
               }
               s+=p[i]-b;
            }
        }
        return s;
    }
}