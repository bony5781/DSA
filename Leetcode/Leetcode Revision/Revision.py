#08-05-2024
class Solution:
    def trap(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        ans = 0
        leftMax, rightMax= height[l], height[r]

        while l < r:

            if leftMax < rightMax:
                l += 1
                leftMax = max(leftMax, height[l])
                ans += leftMax - height[l]
            else:
                r -= 1
                rightMax = max(rightMax, height[r])
                ans += rightMax - height[r]
            
        return ans

#07-05-2024
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        maxA = 0

        while l < r:
            tempA = min(height[l], height[r]) * (r - l)
            maxA = max(maxA, tempA)

            if height[l] > height[r]:
                r -= 1
            else:
                l += 1
        
        return maxA
    
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = []

        for i in range(len(nums) - 2):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            
            l, r = i + 1, len(nums) - 1
            while l < r:
                target = nums[i] + nums[l] + nums[r] 
                if target > 0:
                    r -= 1
                elif target < 0:
                    l += 1
                else:
                    temp = [nums[i], nums[l], nums[r]]
                    ans.append(temp)
                    while l < r and nums[l] == temp[1]:
                        l += 1
                    while l < r and nums[r] == temp[2]:
                        r -= 1
        
        return ans

#06-05-2024
class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        l, r = 0, len(numbers) - 1
        
        while l < r:
            if numbers[l] + numbers[r] == target:
                return [l + 1, r + 1]
            elif numbers[l] + numbers[r] > target:
                r -= 1
            else:
                l += 1
        
        return []

class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.replace(" ","")
        t = ""
        
        for x in s:
            if x.isalnum():
                t += x.lower()
        
        l, r = 0, len(t) - 1
        while l < r:
            if t[l] != t[r]:
                return False
            l += 1
            r -= 1

        return True

# 30-04-2024
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        s1 = set()
        l = 0
        ans = 0

        for r in range(len(s)):
            while s[r] in s1:
                s1.remove(s[l])
                l += 1
            s1.add(s[r])
            ans = max(ans, r - l + 1)
            r += 1
        
        return ans
        
# 29-04-2024
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l , r = 0, 1
        maxP  = 0

        while r < len(prices):
            temp = prices[r] - prices[l]
            if temp > 0:
                maxP = max(temp, maxP)
            else:
                l = r
            r += 1
        
        return maxP

#26-04-2024
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s1 = set(nums)
        ans = 0

        for x in nums:
            if x - 1 not in s1:
                temp = 0
                while x in s1:
                    temp += 1
                    x += 1
                ans = max(ans, temp)
        
        return ans
                    

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s1 = set(nums)
        ans = 0

        for x in nums:
            if x - 1 not in s1:
                temp = 0
                while x + temp in s1:
                    temp += 1
                ans = max(ans, temp)
        
        return ans

#25-04-2024
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(list)
        cols = defaultdict(list)
        square = defaultdict(list)

        for i in range(9):
            for j in range(9):
                if board[i][j] == ".":
                    continue
                if board[i][j] in rows[i] or board[i][j] in cols[j] or board[i][j] in square[i//3,j//3]:
                    return False
                rows[i].append(board[i][j])
                cols[j].append(board[i][j])
                square[i//3,j//3].append(board[i][j])
        
        return True
    
#24-04-2024
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1 for i in range(len(nums))]
    
        forward = 1
        for i in range(len(nums)):
            res[i] *= forward
            forward *= nums[i]
        
        backward = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= backward
            backward *= nums[i]
        
        return res
    
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d1 = defaultdict(int)
        freq = [[] for i in range(len(nums) + 1)]

        for x in nums:
            d1[x] += 1

        for x, c in d1.items():
            freq[c].append(x)

        res = []
        for i in range(len(freq) - 1, 0, -1):
            for x in freq[i]:
                res.append(x)
            if(len(res) == k):
                return res
            
#23-04-2024
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d1 = dict()

        for i in range(len(nums)):
            if target - nums[i] in d1:
                return [i, d1[target - nums[i]]]
            d1[nums[i]] = i
        
        return []

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d1 = defaultdict(list)

        for word in strs:
            sorted_word = ''.join(sorted(word))
            d1[sorted_word].append(word)
        
        return d1.values()
        

#22-04-2024
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d1 = defaultdict(int)

        for i in range(len(s)):
            d1[s[i]] += 1
        
        for i in range(len(t)):
            if t[i] not in d1:
                return False
            else:
                d1[t[i]] -= 1
        
        for x in d1.values():
            if x != 0:
                return False
        
        return True

#22-04-2024
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s1 = set()

        for x in nums:
            if x not in s1:
                s1.add(x)
            else:
                return True
        
        return False

#20-04-2024
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 1
        maxProfit = 0

        while r < len(prices):
            if prices[l] < prices[r]:
                profit = prices[r] - prices[l]
                maxProfit = max(maxProfit, profit) 
            else:
                l = r       
            r += 1
        
        return maxProfit

#19-04-2024
class Solution:
    def trap(self, height: List[int]) -> int:
        
        if not height: return 0

        l, r = 0, len(height) - 1
        leftMax, rightMax = height[l], height[r]
        res = 0

        while l < r:
            if leftMax < rightMax:
                l += 1
                leftMax = max(leftMax, height[l])
                res += leftMax - height[l]
            else:
                r -= 1
                rightMax = max(rightMax, height[r])
                res += rightMax - height[r]
        
        return res
    
#18-04-2024
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        res  = 0

        while l < r:
            temp = min(height[l], height[r]) * ( r - l)
            res = max(temp, res)

            if height[l] > height[r]:
                r -= 1
            else:
                l += 1

        return res

#17-04-2024
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = []
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l, r = i + 1, len(nums) - 1
            while l < r:
                target = nums[i] + nums[l] + nums[r]
                if target > 0:
                    r -= 1
                elif target < 0:
                    l += 1
                else:
                    triplet = [nums[i], nums[l], nums[r]]
                    ans.append(triplet)
                    while l < r and nums[l] == triplet[1]:
                        l += 1
                    while l < r and nums[r] == triplet[2]:
                        r -= 1
        
        return ans

#16-04-2024
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

#15-04-2024
class Solution:
    def isPalindrome(self, s: str) -> bool:
        noSpace = ""
        for i in range(len(s)):
            if s[i].isalnum():
                noSpace += s[i].lower()

        l, r = 0, len(noSpace) - 1
        while l < r:
            if noSpace[l] != noSpace[r]:
                return False
            l += 1
            r -= 1

        return True    
    
class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l, r = 0, len(numbers) - 1
        while l < r:
            if numbers[l] + numbers[r] == target:
                return [l + 1, r + 1]
            elif  numbers[l] + numbers[r] < target:
                    l += 1
            else:
                    r -= 1
        
        return []


#12-04-2024
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(list)
        cols = defaultdict(list)
        matrix = defaultdict(list)

        for i in range(9):
            for j in range(9):
                if board[i][j] == ".":
                    continue

                if board[i][j] in rows[i] or board[i][j] in cols[j] or board[i][j] in matrix[i // 3, j // 3]:
                    return False

                rows[i].append(board[i][j])
                cols[j].append(board[i][j])
                matrix[i // 3, j // 3].append(board[i][j])

        return True

#09-04-2024
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d1 = dict()

        for i in range(len(nums)):
            if target - nums[i] not in d1:
                d1[nums[i]] = i
            else:
                return [i, d1[target - nums[i]]]
    
        return []

#08-04-2024
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d1 = defaultdict(int)

        for i in s:
           d1[i] += 1

        for i in t:
            d1[i] -= 1
        
        for i in d1.values():
            if i != 0:
                return False

        return True

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s1 = set()
        
        for x in nums:
            if x not in s1:
                s1.add(x)
            else:
                return True

        return False
        
        
#05-04-2024
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows  = collections.defaultdict(set)
        cols = collections.defaultdict(set)
        square  = collections.defaultdict(set)

        for i in range(9):
            for j in range(9):
                if board[i][j] == ".":
                    continue
                if (board[i][j] in rows[i] or 
                    board[i][j] in cols[j] or
                    board[i][j] in square[(i // 3, j // 3)]):
                    return False
                rows[i].add(board[i][j])
                cols[j].add(board[i][j])
                square[(i // 3, j // 3)].add(board[i][j])

        return True

#03-04-2024
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
    
#02-04-2024
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