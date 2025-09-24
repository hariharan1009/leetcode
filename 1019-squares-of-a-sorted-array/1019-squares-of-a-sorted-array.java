class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] a=new int[nums.length];
        int k=0;
        for(int i:nums){
            a[k++]=i*i;
        }
        Arrays.sort(a);
        return a;
    }
}