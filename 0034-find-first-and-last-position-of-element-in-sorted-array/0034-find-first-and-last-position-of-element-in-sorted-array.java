class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        a[0]=-1;
        a[1]=-1;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                a[0]=i;
                  z=i;
                break;
            }
        }
      
       for(int i=z;i<nums.length;i++){
            if(nums[i]==target){
                a[1]=i;
            }
        }
        return a;
    }
}