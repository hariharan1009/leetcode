class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int front=(i-startIndex+n)%n;
                int back=(startIndex-i+n)%n;
                res=Math.min(res,Math.min(front,back));
            }            
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}