class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
        
    }
    public void rev(int[] nums,int x,int y){
        while(x<y){
            int tem=nums[x];
            nums[x]=nums[y];
            nums[y]=tem;
            x++;
            y--;
        }
    }
}