class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:      
        m, n = len(obstacleGrid), len(obstacleGrid[0])
        previous = [0] * n
        current = [0] * n
        previous[0] = 1

        for i in range(m):
            if obstacleGrid[i][0] == 1:
                current[0] = 0
            else:
                current[0] = previous[0]

            for j in range(1, n):
                if obstacleGrid[i][j] == 1:
                    current[j] = 0
                else:
                    current[j] = previous[j] + current[j-1]

            previous[:] = current      
        return previous[n-1]