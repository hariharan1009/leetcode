class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32 - s.length(); i++) {
            sb.append('0');
        }
        sb.append(s);
        sb.reverse();        
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}