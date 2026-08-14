class Solution {
    public int trap(int[] h) {
        int l=0,r=h.length-1;
        int lmax=h[l],rmax=h[r];
        int water=0;
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,h[l]);
                water+=lmax-h[l];
            }
            else{
                r--;
                rmax=Math.max(rmax,h[r]);
                water+=rmax-h[r];
            }
        }
        return water;
    }
}