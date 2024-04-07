class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s1 = set(nums)
        longest = 0

        for i in nums:
            if i - 1 not in s1:
                length = 0
                while i + length in s1:
                    length += 1
                longest = max(length, longest)
        
        return longest