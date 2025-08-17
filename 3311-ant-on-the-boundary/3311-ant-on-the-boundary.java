class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c=0,sum=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sum==0){
            c++;
        }
       } 
       return c;
    }
}