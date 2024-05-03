class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "": return ""
        countT, window = defaultdict(int), defaultdict(int)

        for c in t:
            countT[c] += 1
        
        have, need = 0, len(countT)
        res, lenRes = [-1, -1], float("infinity")
        l = 0
        for r in range(len(s)):
            window[s[r]] += 1
            if s[r] in countT and window[s[r]] == countT[s[r]]:
                have += 1

            while have == need:
                if r - l + 1 < lenRes:
                    res = [l, r]
                    lenRes = r - l + 1
                window[s[l]] -= 1
                if s[l] in countT and window[s[l]] < countT[s[l]]:
                    have -= 1
                l += 1
        
        l, r = res
        return s[l: r + 1] if res != float("infinity") else ""