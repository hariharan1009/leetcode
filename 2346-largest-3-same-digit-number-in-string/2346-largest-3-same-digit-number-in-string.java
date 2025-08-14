class Solution {
    public String largestGoodInteger(String num) {
        String a="";
       for(int i=0;i<num.length()-2;i++){
        if(num.charAt(i)==num.charAt(i + 1) && 
                 num.charAt(i)==num.charAt(i+2)){
                  String triplet = num.substring(i, i + 3); 
                if (triplet.compareTo(a) > 0) { 
                    a = triplet;
                }
            }
        }
        return a;
    }
}