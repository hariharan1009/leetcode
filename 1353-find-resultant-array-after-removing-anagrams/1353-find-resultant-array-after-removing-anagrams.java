class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> l=new ArrayList<>();
        l.add(words[0]);
        for(int i=0;i<words.length;i++){
            char[] a=words[i].toCharArray();
            char[] b=l.get(l.size()-1).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(!Arrays.equals(a,b)){
                l.add(words[i]);
            }
        }
        return l;
    }
}