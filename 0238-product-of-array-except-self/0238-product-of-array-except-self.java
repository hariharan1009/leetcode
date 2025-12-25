class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] x=new int[n];
        int p=1;
        int z=0;
        for(int i:nums){
            if(i*p!=0){
                p*=i;
            }
            else{
                z++;
            }
        }
        if (z == 1) {
            for (int i = 0; i < n; i++) {
                x[i] = nums[i] == 0 ? p : 0;
            }
        } else if (z == 0) {
            for (int i = 0; i < n; i++) {
                x[i] = p / nums[i];
            }
        }

        return x;
    }
}