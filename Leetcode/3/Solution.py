class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        s1 = set()
        l = 0
        ans = 0

        for r  in range(len(s)):
            while s[r] in s1:
                s1.remove(s[l])
                l += 1
            s1.add(s[r])
            ans = max(ans, r - l + 1)
            r += 1

        return ans