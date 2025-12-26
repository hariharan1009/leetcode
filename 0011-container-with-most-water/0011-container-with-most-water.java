class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,x=0;
        while(i<j){
            x=Math.max(x,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return x;
    }
}