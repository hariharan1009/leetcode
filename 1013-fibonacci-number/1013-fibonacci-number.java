class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        int cur=1;
        int pre=1;
        int prepre=0;
        for(int i=2;i<=n;i++){
            cur=pre+prepre;
            prepre=pre;
            pre=cur;
        }
        return cur;
    }
}