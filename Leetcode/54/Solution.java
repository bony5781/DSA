import java.util.*;

class Solution {

    public void right(List<Integer> ans, int[][] matrix, int row, int colStart, int colEnd) {
        for (int j = colStart; j <= colEnd; j++) {
            ans.add(matrix[row][j]);
        }
    }

    public void down(List<Integer> ans, int[][] matrix, int col, int rowStart, int rowEnd) {
        for (int i = rowStart; i <= rowEnd; i++) {
            ans.add(matrix[i][col]);
        }
    }

    public void left(List<Integer> ans, int[][] matrix, int row, int colStart, int colEnd) {
        for (int j = colStart; j >= colEnd; j--) {
            ans.add(matrix[row][j]);
        }
    }

    public void up(List<Integer> ans, int[][] matrix, int col, int rowStart, int rowEnd) {
        for (int i = rowStart; i >= rowEnd; i--) {
            ans.add(matrix[i][col]);
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return ans;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            right(ans, matrix, top, left, right); // → move right
            top++;

            down(ans, matrix, right, top, bottom); // ↓ move down
            right--;

            if (top <= bottom) {
                left(ans, matrix, bottom, right, left); // ← move left
                bottom--;
            }

            if (left <= right) {
                up(ans, matrix, left, bottom, top); // ↑ move up
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[][] matrix = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(s1.spiralOrder(matrix));
    }
}
