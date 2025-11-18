class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int x=bits.length;
        int i=0;
        while(i<x-1){
            i+=bits[i]+1;
        }
        return n-1==i;
    }
}