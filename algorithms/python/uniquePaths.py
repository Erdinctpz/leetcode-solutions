class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        
        def fact(x):
            if x == 1 or x == 0:
                return 1
            return x * fact(x-1)
        
        result = fact(m-1 + n-1) // (fact(n-1) * fact(m-1))
        return result