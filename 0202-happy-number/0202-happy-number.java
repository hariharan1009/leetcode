class Solution {
    public boolean isHappy(int n) {
        int sum;
        while(n>9){
            sum=0;
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
        return (n==1||n==7);
    }
}