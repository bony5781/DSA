// Best: O(n^2)
// Average: O(n^2)
// Worst: O(n^2)

import java.util.Arrays;

class Solution {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void selesctionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 24, 9 };
        Solution s = new Solution();
        System.out.println("Array before sorting = " + Arrays.toString(arr));
        s.selesctionSort(arr, arr.length);
        System.out.println("Array after sorting = " + Arrays.toString(arr));
    }
}