class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=num.length-1;i>=0;--i){
            a.add(0,(num[i]+k)%10);
            k=(num[i]+k)/10;
        }
        while(k>0){
            a.add(0,k%10);
            k/=10;
        }
        return a;
    }
}