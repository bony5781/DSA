#3-04-2024
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = [1] * len(nums)

        prefix = 1
        for i in range(len(nums)):
            ans[i] = prefix
            prefix *= nums[i]
        
        postfix = 1
        for i in range(len(nums)-1,-1,-1):
            ans[i] *= postfix
            postfix *= nums[i]

        return ans
    
#2-04-2024
class Solution:
    def isPalindrome(self, s: str) -> bool:
        ans = ''
        for i in range(len(s)):
            if s[i].isalnum():
                ans += s[i].lower()
            else:
                continue

        left = 0
        right = len(ans) - 1
        while left <= right:
            if ans[left] != ans[right]:
                return False
            left += 1
            right -= 1
        
        return True

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        answer = []
        for i in range(len(nums) - 2):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l = i + 1
            r = len(nums) - 1
            while l < r:
                total = nums[i] + nums[l] + nums[r]
                if total < 0:
                    l += 1
                elif total > 0:
                    r -= 1
                else:
                    triplet = [nums[i], nums[l], nums[r]]
                    answer.append(triplet)
                    while l < r and nums[l] == triplet[1]:
                        l += 1
                    while l < r and nums[r] == triplet[2]:
                        r -= 1
        return answer

#24-03-24
class Solution:
    def groupAnagrams(self, strs):
        anagram_map = defaultdict(list)

        for word in strs:
            sorted_word = ''.join(sorted(word))
            anagram_map[sorted_word].append(word)
        
        return list(anagram_map.values())