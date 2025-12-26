class Solution {
    public int bestClosingTime(String customers) {
        int p=0,bp=0,res=0;
        char[] c=customers.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='Y'){
                p--;
                if(p<bp){
                    bp=p;
                    res=i+1;
                }
            }
            else{
                p++;
            }
        }
        return res;
    }
}