class Solution {
    public int[] pivotArray(int[] nums, int p) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for (int i : nums) {
            if(p>i) a.add(i);
            if(p==i) b.add(i);
            if(p<i) c.add(i);
        }
        a.addAll(b);
        a.addAll(c);
        int j=0;
        for(int i:a){
            nums[j++]=i;
        }
        return nums;
    }
}