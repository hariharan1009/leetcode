class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0,n=1;
        int[] a=new int[nums.length];
        for(int i: nums){
            if(i>0){
                a[p]=i;
                p+=2;
            }
            else{
                a[n]=i;
                n+=2;
            }
        }
        return a;
    }
}