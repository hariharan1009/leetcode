class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        String x="";
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                c++;
                if(c==k){
                    x=arr[i];
                }
            }
        }
        return x;
    }
}