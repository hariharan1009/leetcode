class Solution {
    public int countPartitions(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        int c=0,left=0,right=0;
        for(int i=0;i<nums.length-1;i++){
             left+=nums[i];
             right=tot-left;
             if((right-left)%2==0){
                c++;
             }
        }
        return c;
    }
}