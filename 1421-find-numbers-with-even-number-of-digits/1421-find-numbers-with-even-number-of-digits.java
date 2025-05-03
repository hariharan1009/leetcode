class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
       for(int i:nums){
        String a=Integer.toString(i);
        if(a.length()%2==0){
            c++;
        }
       }
       return c;
    }
}