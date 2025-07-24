class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum=0;
        int re=(int)(arr.length*0.05);
        for(int i=re;i<(arr.length-re);i++){
            sum+=arr[i];
        }
        return sum/(arr.length-(re*2));
    }
}