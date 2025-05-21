import java.util.Arrays;

class Solution {

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstColZero = false;

        // Step 1: Mark zeroes in first row and column
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row
                    matrix[0][j] = 0; // mark column
                }
            }
        }

        // Step 2: Zero cells based on marks (skip first row and column)
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Zero the first row if needed
        if (matrix[0][0] == 0) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Zero the first column if needed
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

        // Print final result
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.setZeroes(new int[][] {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        });
    }
}