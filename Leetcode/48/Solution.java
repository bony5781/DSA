import java.util.Arrays;

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Create a deep copy of the original matrix
        int[][] holdMatrix = new int[n][];
        for (int i = 0; i < n; i++) {
            holdMatrix[i] = matrix[i].clone();
        }
        
        // Rotate the matrix by 90 degrees clockwise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = holdMatrix[n - j - 1][i];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[][] matrix = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        s1.rotate(matrix);
    }
}
