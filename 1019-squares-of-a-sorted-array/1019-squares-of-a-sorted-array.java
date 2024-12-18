class Solution {
    public int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
         a[i]=Math.abs(nums[i]*nums[i]);
       }
       Arrays.sort(a);
       return a;
    }
}