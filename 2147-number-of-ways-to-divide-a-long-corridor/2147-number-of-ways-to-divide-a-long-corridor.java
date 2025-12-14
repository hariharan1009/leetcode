class Solution {
    public int numberOfWays(String corridor) {
        int m=1000000007;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<corridor.length();i++){
            if(corridor.charAt(i)=='S'){
                a.add(i);
            }
        }
        if(a.size()%2==1||a.size()==0) return 0;
        long r=1;
        for(int i=2;i<a.size();i+=2){
            int len=a.get(i)-a.get(i-1);
            r=(r*len)%m;
        }
        return (int)r;
    }
}