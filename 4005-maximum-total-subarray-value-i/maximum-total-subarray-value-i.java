class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        for(int i:nums){
            a=Math.min(a,i);
            b=Math.max(b,i);
        }
        return (long)(b-a)*k;
    }
}