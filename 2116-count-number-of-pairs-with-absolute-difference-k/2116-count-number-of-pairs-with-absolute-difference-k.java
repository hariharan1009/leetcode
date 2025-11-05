class Solution {
    public int countKDifference(int[] nums, int k) {
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=map.getOrDefault(nums[i]-k,-1);
            int b=map.getOrDefault(nums[i]+k,-1);
            if(a!=-1) c+=a;
            if(b!=-1) c+=b;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return c;
    }
}