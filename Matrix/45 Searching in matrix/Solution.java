class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;

        int r = 0;
        while (r <= row) {

            if (matrix[r][0] == target || matrix[r][col] == target) {
                return true;
            }

            if (matrix[r][0] < target && matrix[r][col] > target) {
                break;
            }
            r++;
        }
        System.out.println(r);
        if (r > row)
            return false;
        for (int i = 0; i <= col; i++) {
            if (matrix[r][i] == target)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1 } };
        System.out.println(searchMatrix(arr, 0));
    }
}