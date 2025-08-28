class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int t=n*n;
        int x=maxWeight/w;
        if(t*w<=maxWeight){
            return t;
        }
        else{
            return x;
        }
    }
}