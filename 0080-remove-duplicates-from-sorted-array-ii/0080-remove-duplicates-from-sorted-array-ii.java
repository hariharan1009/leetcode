class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                c+=1;
            }
            else{
                c=1;
            }
            if(c<=2){
                nums[j]=nums[i];
                j+=1;
            }
        }
        return j;
    }
}