class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int i:nums){
            if(i==1){
                c++;
                max=Math.max(c,max);
            }
            else{
                c=0;
            }
        }
        return max;
    }
}