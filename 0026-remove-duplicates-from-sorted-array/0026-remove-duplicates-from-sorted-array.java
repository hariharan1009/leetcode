class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            c++;
            nums[c]=nums[i];
        }
       }
       return c+1;
    }
}