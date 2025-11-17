class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                 if(c!=-1 && i-c-1<k ){
                    return false;
            }
            c=i;
         }
        }
        return true;
    }
}