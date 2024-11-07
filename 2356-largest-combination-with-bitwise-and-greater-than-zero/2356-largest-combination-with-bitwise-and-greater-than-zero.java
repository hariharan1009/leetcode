class Solution {
    public int largestCombination(int[] n) {
        int max=0;
        for(int i=0;i<32;i++){
            int c=0;
            for(int j=0;j<n.length;j++){
                if(((n[j]>>i)&1)==1){
                    c++;
                }
            }
            max=Math.max(c,max);
        }
        return max;
    }
}