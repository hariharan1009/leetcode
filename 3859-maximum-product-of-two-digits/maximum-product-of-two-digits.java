class Solution {
    public int maxProduct(int n) {
        int min=0,max=0;
        while(n>0){
            int d=n%10;
            if(d>min){
                max=min;
                min=d;
            }
            else if(d>max){
                max=d;
            }
            n/=10;
        }
        return min*max;
    }
}