class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int x=0;
        for(int i:nums){
            if(c==0){
                x=i;
            }
            if(i==x){
                c++;
            }
            else{
                c--;
            }
        }
        return x;
    }
}