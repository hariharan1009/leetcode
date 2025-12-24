class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i:apple){
            sum+=i;
        }
        int s1=0,c=0;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            s1+=capacity[i];
            c++;
            if(s1>=sum) break;
        }
        return c;
    }
}