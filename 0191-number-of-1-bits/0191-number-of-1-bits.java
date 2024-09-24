class Solution {
    public int hammingWeight(int n) {
       int rem = 0;
        while(n > 0) {
            n = n & (n-1);
            rem++;
        }
        return rem; 
    }
}