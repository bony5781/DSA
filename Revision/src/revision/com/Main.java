package revision.com;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    // Revision 12/10/24
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     int m = matrix[0].length;
    //     int n = matrix.length;
    //     for (int i = 0; i < n; i++) {
    //         if (target >= matrix[i][0] && target <= matrix[i][m - 1]) {
    //             for (int j = 0; j < m; j++) {
    //                 if (target == matrix[i][j]) {
    //                     return true;
    //                 }
    //             }
    //         }
    //     }
    //     return false;
    // }

    // Revision 11/10/24
    // public void insertionSort(int[] arr, int n) {
    // for (int i = 1; i < n; i++) {
    // int curr = arr[i];
    // int j = i - 1;
    // while (j >= 0 && arr[j] >= curr) {
    // arr[j + 1] = arr[j];
    // j--;
    // }
    // arr[j + 1] = curr;
    // }
    // }

    // Revision 10/01/24
    // public int getPairsCount(int[] arr, int n, int k) {
    // HashMap<Integer, Integer> hmap = new HashMap<>();
    // int count = 0;
    // for(int i = 0; i < n; i++){
    // count += hmap.getOrDefault(k-arr[i],0);
    // hmap.put(arr[i],hmap.getOrDefault(arr[i], 0)+1);
    // }
    // return count;
    // }

    // Revision 08/01/24
    // public void merge(int[] arr, int low, int mid, int high) {
    // int[] merged = new int[high - low + 1];
    // int i = low, j = mid + 1, k = 0;
    // while (i <= mid && j <= high) {
    // if (arr[i] <= arr[j]) {
    // merged[k++] = arr[i++];
    // } else {
    // merged[k++] = arr[j++];
    // }
    // }

    // while (i <= mid) {
    // merged[k++] = arr[i++];
    // }

    // while (j <= high) {
    // merged[k++] = arr[j++];
    // }

    // for (int m = low, p = 0; m < merged.length; m++, p++) {
    // arr[p] = merged[m];
    // }
    // }

    // Merge Sort 08/01/2024
    // public void mergeSort(int[] arr, int low, int high) {
    // if(low >= high){
    // return;
    // }
    // int mid = low + (high - low) / 2;
    // mergeSort(arr, low, mid);
    // mergeSort(arr, mid + 1, high);
    // merge(arr, low, mid, high);
    // }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1 };
        int n = arr.length;
        Main main = new Main();
        System.out.println("Array before sorting = " + Arrays.toString(arr));
        main.insertionSort(arr, n);
        System.out.println("Array after sorting = " + Arrays.toString(arr));
    }
}