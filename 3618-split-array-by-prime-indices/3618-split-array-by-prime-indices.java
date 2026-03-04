class Solution {
    public long splitArray(int[] nums) {
        long sum=0,prime=0;
        for(int i=0;i<nums.length;i++){
            if(isprime(i)) prime +=nums[i];
            else sum+=nums[i];
        }
        return Math.abs(sum-prime);
    }
    public boolean isprime(int i){
         if (i < 2) return false;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}