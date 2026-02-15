class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1,j=b.length()-1,c=0;
        while(i>=0||j>=0||c==1){
            int sum=c;
            if(i>=0) sum+=a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            sb.append(sum%2);
            c=sum/2;
        }
        return sb.reverse().toString();
    }
}