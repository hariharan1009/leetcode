class Solution {
    public int search(int[] nums, int t) {
       int l=0;
       int h=nums.length-1;
       while(l<=h){
        int m=l+(h-l)/2;
        if(t==nums[m]){
            return m;
        }
        else if(t<nums[m]){
           h= m-1;
        }
        else{
            l=m+1;
        }
       } 
       return -1;
    }
}