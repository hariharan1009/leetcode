class Solution {
    public int smallestNumber(int n, int t) {
        while(!dig(n,t)){
            n++;
        }
        return n;
    }
     public static boolean dig(int n,int t){
        int p=1;
        while(n!=0){
            p*=n%10;
            n/=10;
        }
        return p%t==0;
    }
}