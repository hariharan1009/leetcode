class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] b=arr.clone();
        Arrays.sort(b);
        int r=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(b[i])){
                map.put(b[i],r++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}