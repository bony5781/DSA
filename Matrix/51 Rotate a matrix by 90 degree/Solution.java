class Solution {

    public void transposeMatrix(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public void reverse(int arr[], int n){
        int start = 0; 
        int end = n - 1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }

    public void rotateBy90(int arr[][], int n) {
        transposeMatrix(arr, n);
        for (int i = 0; i < n; i++) {
            reverse(arr[i],n);
        }
    }

    public void display(int arr[][], int n, int m) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        Solution s = new Solution();
        s.display(mat, 4, 4);
        s.rotateBy90(mat, 4);
        s.display(mat, 4, 4);
    }
}