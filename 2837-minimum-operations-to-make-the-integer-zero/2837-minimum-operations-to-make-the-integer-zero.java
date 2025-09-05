class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int i=1;i<=60;i++){
            long a=(long) num1-(long)num2*i;
            if(a<i) return -1;
            if(Long.bitCount(a)<=i) return i;
        }
        return -1;
    }
}