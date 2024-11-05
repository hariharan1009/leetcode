class Solution {
    public int compareVersion(String version1, String version2) {
     String[] a1=version1.split("\\.");
     String[] a2=version2.split("\\.");
     for(int i=0;i<Math.max(a1.length,a2.length);i++){
        int x= i<a1.length ? Integer.valueOf(a1[i]) : 0;
        int y= i<a2.length ? Integer.valueOf(a2[i]) : 0;
        if(x<y){
            return -1;
        }
        else if(x>y){
            return 1;
        }
     }
     return 0;
    }
}