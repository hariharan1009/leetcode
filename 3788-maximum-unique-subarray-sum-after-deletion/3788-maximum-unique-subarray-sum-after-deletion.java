class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        int sum=0,max=Integer.MIN_VALUE,min=nums[0];
        for(int i:nums){
            if(!s.contains(i) && i>=0){
                sum+=i;
                max=Math.max(max,sum);
                s.add(i);
            }
            else{
                min=Math.max(min,i);
            }
        }
        return max<0 ? min:max;
    }
}