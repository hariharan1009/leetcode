class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=c^nums[i];  //In bit same number will disappear and differ number will be store;
        }
        return c;


        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i+=2){
        //     if(nums[i]!=nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return nums[nums.length-1];
    }
}