class Solution {
    public int minOperations(String[] logs) {
        int c=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(c!=0){
                    c--;
                }
            }
                else if(logs[i].equals("./")){
                    continue;
                }
                else{
                    c++;
                }
            
        }
        return c;
    }
}