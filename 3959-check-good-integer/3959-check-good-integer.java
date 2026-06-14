class Solution {
    public boolean checkGoodInteger(int n) {
        return sqsum(n)-sum(n)>=50;
    }
    private int sum(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
    private int sqsum(int n){
        int sum1=0;
        while(n>0){
            int d=n%10;
            sum1+=d*d;
            n/=10;
        }
        return sum1;
    }
}