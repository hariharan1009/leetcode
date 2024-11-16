class Solution {
    public int findCenter(int[][] a) {
       if(a[0][0]==a[1][0] || a[0][0]==a[1][1])
        return a[0][0];
       else
         return a[0][1];
    }
}