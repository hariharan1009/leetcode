class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        int min=nums[0];
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[l]<=nums[mid]){
                min=Math.min(min,nums[l]);
                l=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                r=mid-1;
            }
        }
        return min;



        // int x=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<x){
        //         x=nums[i];
        //     }
        // }
        // return x;
    }
}