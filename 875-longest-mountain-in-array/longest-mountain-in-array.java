class Solution {
    public int longestMountain(int[] arr) {
        int max=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int l=i,r=i;
                while(l>0 && arr[l]>arr[l-1]){
                    l--;
                }
                while(r<arr.length-1 && arr[r]>arr[r+1]){
                    r++;
                }
                max=Math.max(max,r-l+1);
            }
        }
        return max;
    }
}