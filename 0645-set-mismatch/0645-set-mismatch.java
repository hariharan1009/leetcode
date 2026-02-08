class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] a=new int[nums.length+1];
        for(int i:nums){
            a[i]++;
        }
        int loss=-1,extra=-1,c=0;
        for(int i=1;i<=nums.length;i++){
            if(a[i]==2) loss=i;
            else if(a[i]==0) extra=i;
        }
        return new int[]{loss,extra};
    }
}