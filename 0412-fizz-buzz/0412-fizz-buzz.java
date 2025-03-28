class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((i+1)%3==0 && (i+1)%5==0){
                a.add("FizzBuzz");
            }
            else if((i+1)%3==0 ){
                a.add("Fizz");
            }
            else if((i+1)%5==0){
                a.add("Buzz");
            }
            else{
                a.add(Integer.toString(i+1));
            }
        }
        return a;
    }
}