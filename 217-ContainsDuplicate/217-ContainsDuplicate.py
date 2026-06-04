# Last updated: 6/4/2026, 7:24:50 PM
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        return len(set(nums))!=len(nums)