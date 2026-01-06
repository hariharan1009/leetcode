class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    a[i]+=Math.abs(j-i)*(boxes.charAt(j)-'0');
                }
            }
        }
        return a;
    }
}