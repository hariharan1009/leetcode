class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] a=new int[2];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                a[0]=nums[i];
                break;
            }
        }
         for(int i=nums.length-1;i>=0;i--){
            if(nums[i-1]==nums[i]){
                a[1]=nums[i];
                break;
            }
        }
        return a;
    }
}