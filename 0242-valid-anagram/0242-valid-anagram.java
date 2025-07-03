class Solution {
    public boolean isAnagram(String s, String t) {
        //using hash map
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)-1);
        }
          for(int i:map.values()){
        if(i!=0){
            return false;
        }
       }
        return true;
    //using array 
    //     char[] a=s.toCharArray();
    //    char[] b=t.toCharArray();
    //    Arrays.sort(a);
    //    Arrays.sort(b);
    //    if(s.length()!=t.length()){
    //     return false;
    //    }
    //    return Arrays.equals(a,b); 
    }
}