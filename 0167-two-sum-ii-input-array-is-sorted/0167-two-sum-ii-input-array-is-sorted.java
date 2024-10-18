class Solution {
    public int[] twoSum(int[] num, int target) {
        int l=0;
        int r=num.length-1;
        while(l<r){
            int sum=num[l]+num[r];
            if(sum==target){
                return new int[] {l+1,r+1};
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[] {};
    }
}