class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] b=s.split(" ");
        if(pattern.length()!=b.length){
            return false;
        }
        for(int i=0;i<b.length;i++){
            char a=pattern.charAt(i);
            String x=b[i];
            if(map.containsKey(a)){
                if(!map.get(a).equals(x)){
                    return false;
                }
            }
            else{
                if(map.containsValue(x)){
                return false;
                }
                map.put(a,x);   
            }
        }
        return true;
    }
}