class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s1 = set()
        for x in nums:
            if x not in s1:
                s1.add(x)
            else:
                return True
        return False
        