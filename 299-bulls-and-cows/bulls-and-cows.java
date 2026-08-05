class Solution {
    public String getHint(String secret, String guess) {
        int b=0,c=0;
        int[] a=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                b++;
            }
            else{
                if(a[secret.charAt(i)-'0']++ <0){
                    c++;
                }
                if(a[guess.charAt(i)-'0']-- >0){
                    c++;
                }
            }
        }
        return b+"A"+c+"B";
    }
}