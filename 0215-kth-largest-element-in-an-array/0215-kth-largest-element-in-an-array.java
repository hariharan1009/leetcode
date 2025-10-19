class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:nums){
            p.add(i);
            if(p.size()>k){
                p.poll();
            }
        }
        return p.peek();
    }
}