class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i-1])!=Math.abs(arr[i]-arr[i+1]))
                return false;
        }
        return true;
    }
}