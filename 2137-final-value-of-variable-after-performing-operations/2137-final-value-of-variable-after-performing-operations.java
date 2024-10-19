class Solution {
    public int finalValueAfterOperations(String[] a) {
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i].charAt(1)=='+'){
                c++;
            }
            else{
                c--;
            }
        }
        return c;
    }
}