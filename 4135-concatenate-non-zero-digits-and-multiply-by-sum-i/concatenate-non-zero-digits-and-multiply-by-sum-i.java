class Solution {
    public long sumAndMultiply(int n) {
        long x=0,sum=0,p=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            if(d>0){
                x+=d*p;
                p*=10;
            }
            n/=10;
        }
        return x*sum;
    }
}