class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # nums.sort()
        # c=0
        # for i in range(len(nums)-2):
        #     if nums[i==nums[i+1]]:
        #         c+=c
        #     if c>len(nums)/2:
        #         return nums[i]
        #     else:
        #         c=1
        # a=nums[len(nums)/2]
        # return a
        nums.sort()
        return nums[len(nums)//2]
        