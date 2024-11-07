class Solution {
    public boolean isUgly(int n) {   
        if(n<=0){
            return false;
        } 
        while(n%2==0||n%3==0||n%5==0){
            if(n%2==0){
                n/=2;
            }
            else if(n%3==0){
                n/=3;
            }
            else if(n%5==0){
                n/=5;
            }
        }
        return n==1;
        
        // if(n==0){
        //     return false;
        // }
        // for(int i = 2; i<6; i++){
        //     while(n%i==0){
        //         n = n/i;
        //     }
        // }
        // return n==1;
    }
}