class Solution {
    public void setZeroes(int[][] matrix) {
          
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // STEP 1: Check if the first row has any 0
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // STEP 2: Check if the first column has any 0
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // STEP 3: Mark rows and columns using first row & first column
        // If matrix[i][j] == 0, then mark row i and column j
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row i
                    matrix[0][j] = 0; // mark column j
                }
            }
        }

        // STEP 4: Use markers to set cells to zero
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // STEP 5: If the first row had any zero originally → set whole first row to zero
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // STEP 6: If the first column had any zero originally → set whole first column to zero
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}