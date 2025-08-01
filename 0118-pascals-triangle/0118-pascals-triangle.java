class Solution {
    public List<List<Integer>> generate(int numRows) {
     ArrayList<List<Integer>> l=new ArrayList<>();
     for(int i=0;i<numRows;i++){
        ArrayList<Integer> r=new ArrayList<>();
    for(int j=0;j<=i;j++){
        if(j==0||j==i){
            r.add(1);
        }
        else{
            int x = l.get(i - 1).get(j - 1) + l.get(i - 1).get(j);
            r.add(x);
        }
    }
            l.add(r);
     }   
     return l;
    }
}