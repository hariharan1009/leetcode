class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            int diff=Math.abs(arr[i]-arr[i-1]);
            int diff2=Math.abs(arr[i]-arr[i+1]);
            if(diff2!=diff){
                return false;
            }
        }
        return true;
    }
}