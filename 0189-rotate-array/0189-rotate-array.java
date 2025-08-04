class Solution {
    public void rotate(int[] nums, int k) {
        // int n=nums.length;
        // int[] a=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     a[(i+k)%n]=nums[i];
        // }
        // for(int i=0;i<a.length;i++){
        //     nums[i]=a[i];
        // }
        
        int n=nums.length;
        if(n<1){
            return ;
        }
        k=k%n;
         rev(nums,0,n-1);
         rev(nums,0,k-1);
         rev(nums,k,n-1);

    }
    public static void rev(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}