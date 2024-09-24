class Solution {
    public int reverse(int x) {
        int r=0;
        int n=0;
        while(x!=0){
            n=x%10;
             if(r<Integer.MIN_VALUE/10 || r>Integer.MAX_VALUE/10){
                return 0;
            }
             r=(r*10)+n;
             x/=10;

        }
        return r;
    }
}