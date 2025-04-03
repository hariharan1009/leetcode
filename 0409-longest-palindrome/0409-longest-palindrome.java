class Solution {
    public int longestPalindrome(String s) {
          HashSet<Character> set = new HashSet<>();
          int len=0;
          for(char i:s.toCharArray()){
            if(set.contains(i)){
                set.remove(i);
                len+=2;
            }
            else{
                set.add(i);
            }
          }
          if(!set.isEmpty()){
            len+=1;
          }
          return len;
    }
}