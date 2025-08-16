class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=arr[n-1];
        int[] res=new int[n];
        for(int i=n-2;i>=0;i--){
            int cur=arr[i];
            res[i]=max;
            if(max<cur){
                max=cur;
            }
        }
        res[n-1]=-1;
        return res;
    }
}