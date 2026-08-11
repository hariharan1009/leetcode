class Solution {
    public int missingInteger(int[] nums) {
       Set<Integer> s=new HashSet<>(nums.length);
       for(int i:nums){
        s.add(i);
       } 
       int sum= nums[0];
       for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]+1) sum+=nums[i];
        else break;
       }
       while(s.contains(sum)){
        sum++;
       }
       return sum;
    }
}