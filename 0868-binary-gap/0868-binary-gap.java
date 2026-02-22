class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int c=0,max=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (c != -1) {
                    max = Math.max(max, i - c);
                }
                c = i;
            }
        }
        return max;
    }
}