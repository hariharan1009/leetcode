class Solution {
    public String modifyString(String s) {
        char[] c=s.toCharArray();
        char j;
        for(int i=0;i<c.length;i++){
            if(c[i]=='?'){
                for( j='a';j<='z';j++){
                    if((i==0 || j!=c[i-1]) && (i==c.length-1 || j!=c[i+1])){
                        c[i]=j;
                        break;
                    }
                }
            }
        }
        return String.valueOf(c);
    }
}