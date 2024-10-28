class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        gen(l,n,"",0,0);
        return l;
    }
    public static void gen(List<String>l,int n,String s,int open,int close){
         if(s.length()==n*2){
            l.add(s);
            return;
        }
        if(open<n){
            gen(l,n,s+"(",open+1,close);
        }
        if(close<open){
            gen(l,n,s+")",open,close+1);
        }
    }
}