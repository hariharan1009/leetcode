class Solution {
    public void setZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] r=new int[n];
        int[] c=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
             for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]==1 || c[j]==1){
                    mat[i][j]=0;
                }
            }
        }
    }
}