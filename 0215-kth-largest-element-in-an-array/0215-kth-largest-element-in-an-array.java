class Solution {
    public int findKthLargest(int[] nums, int k) {
    //      Set<Integer> s=new HashSet<>();
    //     for(int i:nums){
    //         s.add(i);
    //     }
    //     int[] arr=new int[s.size()];
    //     int in=0;
    //     for(int i:s){
    //         arr[in++]=i;
    //     }
        Arrays.sort(nums);
        return nums[nums.length-k];
        
    }
}