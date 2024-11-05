class Solution {
    public int mySqrt(int x) {
        long i=1;
        for(i=1;(i*i)<=x;i++);
        return (int)i-1;
    }
}