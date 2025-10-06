class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] x=new int[n];
        for(int i=0;i<n;i++){
            x[(i+k)%n]=nums[i];
        }
        int j=0;
        for(int i:x){
            nums[j++]=i;
        }
    }
}