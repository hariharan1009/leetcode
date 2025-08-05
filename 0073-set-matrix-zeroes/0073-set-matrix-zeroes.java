class Solution {
    public void setZeroes(int[][] matrix) {
        int[] a=new int[matrix.length];
        int[] b=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    a[i]=-1;
                    b[j]=-1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(a[i]==-1||b[j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}