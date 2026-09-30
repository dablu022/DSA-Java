class Solution {
    public int[][] generateMatrix(int n) {
          int matrix[][]= new int[n][n];
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        int num=1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            // Traverse Right
            for (int j = colBegin; j <= colEnd; j++) {
                matrix[rowBegin][j] =num;
                num++;
            }
            rowBegin++;
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j++) {
               matrix[j][colEnd]=num;
               num++;
            }
            colEnd--;
            // Traverse Left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
              matrix[rowEnd][j]=num;
              num++;
                }
                rowEnd--;
            }
            // Traverse Up
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    matrix[j][colBegin] = num;
                    num++;
                }
                colBegin++;
            }
        }
        return matrix;
    }
}