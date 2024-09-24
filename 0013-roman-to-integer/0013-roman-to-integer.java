class Solution {
    public int romanToInt(String s) {
        int x=0;
        int t=0;
        for(int i = s.length() - 1; i >= 0; i--){
            int a=0;
            if(s.charAt(i)=='I'){
                a=1;
            }
            else if(s.charAt(i)=='V'){
                a=5;
            }
            if(s.charAt(i)=='X'){
                a=10;
            }
            if(s.charAt(i)=='L'){
                a=50;
            }
            if(s.charAt(i)=='C'){
                a=100;
            }
             if(s.charAt(i)=='D'){
                a=500;
            }
            if(s.charAt(i)=='M'){
                a=1000;
            } 
            if(a<x){
                t-=a;
            }
            else{
                t+=a;
            }
            x=a;
        }
        return t;
    }
}