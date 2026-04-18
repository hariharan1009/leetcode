class Solution {
    public int mirrorDistance(int n) {
        int x=n;
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        return Math.abs(r-x);
    }
}