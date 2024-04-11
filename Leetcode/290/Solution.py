class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        d1 = dict()
        s = s.split()
        if len(pattern) != len(s):
            return False

        for i in range(len(pattern)):
            print(s[i])
            if pattern[i] not in d1.keys() and s[i] not in d1.values():
                d1[pattern[i]] = s[i]
            else:
                if pattern[i] not in d1.keys() or s[i] != d1[pattern[i]]:
                    return False

        return True