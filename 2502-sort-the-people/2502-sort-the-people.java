class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<names.length;i++){
            for(int j=i+1;j<names.length;j++){
                if(heights[i]<heights[j]){
                int C=heights[i];
                heights[i]=heights[j];
                heights[j]=C;
                String a=names[i];
                names[i]=names[j];
                names[j]=a;
                }
            }
        }
    return names;
    }
}