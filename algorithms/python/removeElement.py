class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        temp = 0
        for i, num in enumerate(nums):
            if num != val:
                nums[temp] = nums[i]
                temp += 1
        
        return temp