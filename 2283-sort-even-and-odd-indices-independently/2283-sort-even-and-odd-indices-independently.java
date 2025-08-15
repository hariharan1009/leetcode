class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> e=new ArrayList<>();
        ArrayList<Integer> o=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2!=0) o.add(nums[i]);
            else e.add(nums[i]);
        }
        Collections.sort(e);
        Collections.sort(o);
        Collections.reverse(o);
        int[] res=new int[n];
        int i=0,j=0;
        for(int k=0;k<n;k++){
            if(k%2!=0) res[k]=o.get(i++);
            else res[k]=e.get(j++);
        }
        return res;
    }
}