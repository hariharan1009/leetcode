class Solution {
    public int minPartitions(String n) {
      int c=0;
      for(int i=0;i<n.length();++i) {
        c=Math.max(c,n.charAt(i)-'0');
      }
      return c;
    }
}