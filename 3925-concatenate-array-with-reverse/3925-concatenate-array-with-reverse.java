class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] a =new int[n*2];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            a[i+n]=nums[n-i-1];
        }
        return a;
    }
}