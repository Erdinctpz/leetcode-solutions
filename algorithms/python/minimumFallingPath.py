class Solution:
    def minFallingPathSum(self, matrix: List[List[int]]) -> int:
        if len(matrix) == 1:
            return matrix[0][0]

        rows = len(matrix)
        for i in range(rows-2, -1, -1):
            for j in range(rows):
                if j == 0:
                    matrix[i][j] += min(matrix[i+1][j], matrix[i+1][j+1])
                elif j == len(matrix)-1:
                    matrix[i][j] += min(matrix[i+1][j], matrix[i+1][j-1])
                else:
                    matrix[i][j] += min(matrix[i+1][j], matrix[i+1][j+1], matrix[i+1][j-1])

        return min(matrix[0])