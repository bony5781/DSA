package revision.com;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public void merge(int[] arr, int low, int mid, int high) {
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

        for (int m = low, p = 0; m < merged.length; m++, p++) {
            arr[p] = merged[m];
        }
    }

    //Merge Sort 08/01/2024
    public void mergeSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr1 = {-10, -2, -3, -4};
        int n = arr1.length;
        Main main = new Main();
        System.out.println("Array before sorting = " + Arrays.toString(arr1));
        main.mergeSort(arr1, 0, n - 1);
        System.out.println("Array after sorting = " + Arrays.toString(arr1));
    }
}