class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n> 0) {
            n--;  
            char d=(char)('A'+n%26);
            sb.insert(0,d);
            n/=26;
        }
        return sb.toString();
    }
}