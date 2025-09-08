class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int a = i;
            int b = n - i;
            if (zero(a) && zero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{};
    }
    private boolean zero(int n) {
        while (n > 0) {
            int d=n%10;
            if (d==0) {
                return false;
            }
            n/= 10;
        }
        return true;
    }
}