class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> a=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold){
                a.add(i);
            }
        }
        return a;
    }
}