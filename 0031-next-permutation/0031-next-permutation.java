class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        rev(nums,i+1);
    }
     public static void swap(int[] nums,int i,int j) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        public static void rev(int[] nums,int s){
            int e=nums.length-1;
            while(s<e){
                swap(nums,s,e);
                s++;
                e--;
            }
        }
}