class Solution {
    public int numWaterBottles(int b, int e) {
        int sum=b;
        while(b>=e){
            sum+=b/e;
            b=(b/e)+(b%e);
        }
        return sum;
    }
}