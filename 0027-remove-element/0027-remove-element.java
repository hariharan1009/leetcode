class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            
            }
        }
            return j;
    }
}