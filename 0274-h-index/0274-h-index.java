class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        int max=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>=c.length-i){
                max=Math.max(max,c.length-i);
            }
        }
        return max;
    }
}