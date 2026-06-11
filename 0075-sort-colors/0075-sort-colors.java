class Solution {
    public void sortColors(int[] nums) {
       int l=0,mid=0 ,h=nums.length-1;
       while(mid<=h){
        if(nums[mid]==0){
            swap(nums,l,mid);
            l++;
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            swap(nums, mid,h);
            h--;
        }
       }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}