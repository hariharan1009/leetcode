class Solution {
    public long distributeCandies(int n, int limit) {
        long x=0;
        for(int i=0;i<=Math.min(limit,n);i++){
            if(n-i<=2*limit){
                x+=Math.min(n-i,limit)-Math.max(0,n-i-limit)+1;
            }
        }
        return x;
    }
}