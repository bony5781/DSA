class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        res = ''
        for i in range(len(s)):
            if s[i].isalnum():
                res += s[i].lower()
            else:
                continue
        
        i = 0
        j = len(res) - 1
        while j >= i:
            if res[i] != res[j]:
                return False
            i += 1
            j -= 1

        return True