class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int max2=0;
        for(int i:nums){
            if(i>max){
                max2=max;
                max=i;
            }
            else{
                max2=Math.max(max2,i);
            }
        }
        return (max2-1)*(max-1);
    }
}