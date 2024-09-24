class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int tem=x;
        int r=0;
        int n=0;
        while(x>0){
            n=x%10;
            x/=10;
            r=r*10 +n;
        }
        if(tem==r){
            return true;
        }
        else{
            return false;
        }
    }
}