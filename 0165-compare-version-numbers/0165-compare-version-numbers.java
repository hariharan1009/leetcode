class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a=version1.split("\\.");
        String[] b=version2.split("\\.");
        for(int i=0;i<Math.max(a.length,b.length);i++){
            int x= i<a.length ? Integer.valueOf(a[i]) : 0;
            int y= i<b.length ? Integer.valueOf(b[i]) : 0;
            if (x > y) {
                return 1;
            } 
            else if (x < y) {
                return -1;
            }
        }
        return 0;
    }
}