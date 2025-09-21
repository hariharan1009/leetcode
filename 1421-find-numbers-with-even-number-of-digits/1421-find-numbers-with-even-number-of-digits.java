class Solution {
    public int findNumbers(int[] nums) {
        
        int even=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            int x=nums[i];
            while(x>0){
                x/=10;
                c++;
            }
            if(c%2==0){
                even++;
            }
        }
        return even;
    }
}