class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] a=new int[2];
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                a[j]=nums[i];
                j++;
            }
        }
        return a;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int[] x=new int[2];
        // int fl=0;
        // for(int i=0;i<nums.length;i++){
        //     if(map.get(nums[i])==2 && fl==0){
        //         x[0]=nums[i];
        //         fl=1;
        //     }
        //     else if(map.get(nums[i])==2 && fl==1){
        //         x[1]=nums[i];
        //     }
        // }
        // return x;
    }
}