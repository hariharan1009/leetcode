class Solution {
    public int maxProfit(int[] a) {
        int x=a[0];
        int y=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<x){
               x=a[i];
            }
            else{
                y=Math.max(y,a[i]-x);
            }
        }
        return y;
    }
}