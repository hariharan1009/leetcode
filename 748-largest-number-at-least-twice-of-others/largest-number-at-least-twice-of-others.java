class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int p=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                p=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(p!=i && nums[i]*2>max){
                return -1;
            }
        }
        return p;
    }
}