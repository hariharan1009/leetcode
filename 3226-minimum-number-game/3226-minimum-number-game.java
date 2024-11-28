class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i=i+2){
             a=nums[i+1];
            nums[i+1]=nums[i];
            nums[i]=a;
        }
        return nums;
    }
}