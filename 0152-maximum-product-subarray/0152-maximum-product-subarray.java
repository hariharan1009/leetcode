class Solution {
    public int maxProduct(int[] nums) {
        int fin=Integer.MIN_VALUE;
        int max=1,min=1;
        for(int i:nums){
            int temp=max*i;
            max=Math.max(temp,Math.max(min*i,i));
            min=Math.min(temp,Math.min(min*i,i));
            fin=Math.max(max,fin);
        }
        return fin; 
    }
}