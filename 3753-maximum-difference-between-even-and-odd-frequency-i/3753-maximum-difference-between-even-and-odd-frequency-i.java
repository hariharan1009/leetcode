class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int emax=Integer.MAX_VALUE,omax=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            int ecount=0,ocount=0;
            if(map.get(s.charAt(i))%2==0){
                ecount=map.get(s.charAt(i));
                emax=Math.min(ecount,emax);
            }
            if(map.get(s.charAt(i))%2!=0){
                ocount=map.get(s.charAt(i));
                omax=Math.max(ocount,omax);
            }
            
        }
        return omax-emax;
    }
}