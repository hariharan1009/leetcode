class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] a=new int[2];
       a[0]=bs(nums,target);
       a[1]=bss(nums,target); 
       return a;
    }
    public int bs(int[] nums, int target){
        int s=0,l=nums.length-1,x=-1;
        while(s<=l){
            int mid=(s+l)/2;
            if(nums[mid]>=target){
                l=mid-1;
            }
            else{
                s=mid+1;
            }
            if(nums[mid]==target){
                x=mid;
            }
        }
            return x;
    }
    public int bss(int[] nums, int target){
       int x = -1;
        int s = 0;
        int l = nums.length - 1;
        while (s <= l) {
            int mid = (s + l) / 2;
            if (nums[mid] <= target) {
                s = mid + 1;
            } else {
                l = mid - 1;
            }
            if (nums[mid] == target){
                x = mid;
            } 
        }
        return x;

    }
}