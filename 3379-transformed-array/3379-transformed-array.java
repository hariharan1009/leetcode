class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=nums[(((i + nums[i]) % n) + n) % n];
        }
        return a;
    }
}