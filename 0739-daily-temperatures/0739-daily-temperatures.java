class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s=new Stack<>();
        int[] a=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!s.isEmpty() && temp[i]>temp[s.peek()]){
                int index=s.pop();
                a[index]=i-index;
            }
            s.push(i);
        }
        return a;
    }
}