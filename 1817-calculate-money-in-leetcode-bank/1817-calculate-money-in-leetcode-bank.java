class Solution {
    public int totalMoney(int n) {
        int tot=0;
        for(int i=0;i<n;i++){
            tot+=(i/7+1)+(i%7);
        }
        return tot;
    }
}