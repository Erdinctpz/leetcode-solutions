class Solution:
    def isStrictlyPalindromic(self, n: int) -> bool:
        for i in range(n-1):
            cpy = n
            result = ""

            while cpy != 0: 
                digit = cpy % 3
                result += str(digit) 
                cpy = cpy // 3

        if result == result[:-1]:
            return True
        return False