class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int a1=1,a2=1;
        for(int i=0;i<n;i++){
            int temp=a1+a2;
            a2=a1;
            a1=temp;
        }
        return a2;
    }
}