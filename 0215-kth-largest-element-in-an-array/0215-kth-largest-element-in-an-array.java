class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            p.add(nums[i]);
            if(p.size()>k){
                p.poll();
            }
        }
        return p.peek();
    }
}