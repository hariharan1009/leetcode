class Solution {
    public boolean isSameAfterReversals(int n) {
        if(n!=0){
            return (n%10)!=0;
        }
        return true;
    }
}