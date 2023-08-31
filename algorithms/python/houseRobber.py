class Solution:
    def rob(self, nums: List[int]) -> int:
        dp = [0] * len(nums)
        dp[0] = nums[0]
        if(len(nums) > 1):
            dp[1] = nums[1]
        else:
            return dp[0]
        
        for i in range(2,len(nums)):
            if i > 2:
                dp[i] = nums[i] + max(dp[i - 2], dp[i - 3])
            else:
                dp[i] = nums[i] + dp[i - 2]

        return max(dp[-1], dp[-2])