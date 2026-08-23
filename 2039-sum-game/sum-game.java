class Solution {
    public boolean sumGame(String num) {
       int rq=0,lq=0,rsum=0,lsum=0;
       for(int i=0;i<num.length()/2;i++){
        char c=num.charAt(i);
        if(c=='?') lq++;
        else lsum+=c-'0';
       } 
       for(int i=num.length()/2;i<num.length();i++){
        char c=num.charAt(i);
        if(c=='?') rq++;
        else rsum+=c-'0';
       } 

       return (lsum-rsum)*2!=(rq-lq)*9;
    }
}