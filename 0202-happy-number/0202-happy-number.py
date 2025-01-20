class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        while n>9:
            sum=0
            while n!=0:
                sum+=(n%10)*(n%10)
                n/=10
            n=sum
        return (n==1 or  n==7)
        