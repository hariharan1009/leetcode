class Solution {
    public double average(int[] salary) {
        int max=salary[0],min=salary[0],sum=salary[0];
        for(int i=1;i<salary.length;i++){
            if(max<salary[i]) max=salary[i];
            if(min>salary[i]) min=salary[i];
            sum+=salary[i];
        }
        int tot=sum-(max+min);
        double ans=(double)tot/(salary.length-2);
        return ans;
    }
}