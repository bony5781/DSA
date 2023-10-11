class Solution {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void rearrange(int[] arr, int n) {
        int i = -1;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                swap(arr, i, j);
            }
        }
    }

    public static void display(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3 - 1, -2, -3, 4, -6 };
        int n = arr.length;
        rearrange(arr, n);
        display(arr, n);
    }
}