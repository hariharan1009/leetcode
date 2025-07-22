class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n>0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        return pro-sum;
    }
}