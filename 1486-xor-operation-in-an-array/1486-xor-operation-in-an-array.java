class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
        }
        
        for(int i=nums.length-1;i>0;i--){
            nums[0]^=nums[i];
        }
        return nums[0];
    }
}