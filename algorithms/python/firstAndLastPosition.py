class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        positions = [-1, -1]
        for i, num in enumerate(nums):
            if positions[0] == -1 and nums[i] == target:
                positions[0] = i
            if target == nums[i]:
                positions[1] = i
        return positions