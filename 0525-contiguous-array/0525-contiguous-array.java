class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max=0,c=0;;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c+=1;
            }
            else{
                c-=1;
            }
            if(map.containsKey(c)){
                max=Math.max(max,i-map.get(c));
            }
            else{
                map.put(c,i);
            }
        }
        return max;
    }
}