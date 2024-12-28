class Solution {
    public String[] divideString(String s, int k, char fill) {
       int n = (s.length() + k - 1) / k; 
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            int start = i * k;
            int end = Math.min(start + k, s.length());
            String group = s.substring(start, end);
            if (group.length() < k) {
                StringBuilder sb = new StringBuilder(group);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                group = sb.toString();
            }
            
            a[i] = group;
        }
        
        return a;
    }
}