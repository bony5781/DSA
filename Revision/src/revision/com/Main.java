package revision.com;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    // Revision 15/01/24
    public void mergeSort(int[] arr, int low, int mid, int high) {
        int[] merged = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = arr[i++];
        }

        while (j <= high) {
            merged[k++] = arr[j++];
        }

        for (int m = low, l = 0; l < merged.length; m++, l++) {
            arr[m] = merged[l];
        }
    }

    public void merge(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        merge(arr, low, mid);
        merge(arr, mid + 1, high);
        mergeSort(arr, low, mid, high);
    }

    // public void insertionSort(int[] arr, int n){
    // for(int i = 1; i < n; i++){
    // int curr = arr[i];
    // int j = i - 1;
    // while(j >= 0 && curr < arr[j]){
    // arr[j+1] = arr[j];
    // j--;
    // }
    // arr[j+1] = curr;
    // }
    // }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1 };
        int n = arr.length;
        Main main = new Main();
        System.out.println("Array before sorting = " + Arrays.toString(arr));
        main.merge(arr, 0, n - 1);
        System.out.println("Array after sorting = " + Arrays.toString(arr));
    }
}