class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
        int a=0;
        while(n>0){
            a=a+(n%10);
            n/=10;
        }
        if(x%a==0){
            return a;
        }
    return -1;
    }
}