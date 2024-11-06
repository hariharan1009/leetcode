class Solution {
    public boolean canSortArray(int[] nums) {
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            fun(a,i,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j] && a[i]!=a[j]){
                      return false;
                }
            }
        }
         return true;
    }
        public void fun(int[] a,int i,int n){
            int c=0;
             while(n>0){
                if((n&1)==1){
                    c++;
                }
                n=n>>1;
             }
             a[i]=c;
        }
}