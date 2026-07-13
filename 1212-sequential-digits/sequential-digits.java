class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
     ArrayList<Integer> l=new ArrayList<>();
     for(int i=1;i<=9;i++){
        int x=i;
        for(int j=i+1;j<=9;j++){
            x=x*10+j;
            if(x>=low && x<=high){
                l.add(x);
            }
        }
     }
    Collections.sort(l);
    return l;
    }
}