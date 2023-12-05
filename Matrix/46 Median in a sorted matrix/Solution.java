import java.util.Arrays;

class Solution {

    int upperBound(int arr[], int x, int C) {
        int low = 0, high = C - 1;
        int ans = C;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    int countSmallEqual(int matrix[][], int R, int C, int x) {
        int count = 0;
        for (int i = 0; i < R; i++) {
            count += upperBound(matrix[i], x, C);
        }
        return count;
    }

    int median(int matrix[][], int R, int C) {
        // code here
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < R; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[0][C - 1]);
        }

        int req = (R * C) / 2;
        while  (low <= high ) {
            int mid = (low + high) / 2;
            int smallerEquals = countSmallEqual(matrix, R, C, mid);
            if (smallerEquals <= req)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
        Solution s = new Solution();
        System.out.println(s.median(arr, 3, 3));
    }
}

// class Solution {
// int median(int matrix[][], int R, int C) {
// // code here
// int arr[] = new int[R * C];
// int c = 0;
// for (int i = 0; i < R; i++) {
// for (int j = 0; j < C; j++) {
// arr[c] = matrix[i][j];
// c++;
// }
// }
// Arrays.sort(arr);
// return arr[(R * C) / 2];
// }

// public static void main(String[] args) {
// int arr[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
// Solution s = new Solution();
// System.out.println(s.median(arr, 3, 3));
// }
// }