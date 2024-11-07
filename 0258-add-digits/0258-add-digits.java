class Solution {
    public int addDigits(int n) {
       if(n==0){
        return 0;
       }
       else if(n%9==0){
        return 9;
       }
     return n%9;
    }
}