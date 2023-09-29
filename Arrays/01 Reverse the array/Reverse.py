def ReverseArray(str):
    end = len(str)-1
    strNew = ""
    while (end >= 0):
        strNew += str[end]
        end -= 1
    return strNew


s1 = "Hello"
print(ReverseArray(s1))
