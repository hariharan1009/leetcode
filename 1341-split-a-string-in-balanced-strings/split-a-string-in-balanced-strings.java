class Solution {
    public int balancedStringSplit(String s) {
      int rl=0,c=0;
      for(char ch:s.toCharArray()){
        if(ch=='L') rl++;
        if(ch=='R') rl--;
        if(rl==0) c++;
      }
      return c;
    }
}