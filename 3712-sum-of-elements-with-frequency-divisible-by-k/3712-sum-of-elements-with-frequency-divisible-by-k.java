class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(int i:nums){
            if(map.get(i)%k==0){
                sum+=i;
            }
        }
        return sum;
    }
}