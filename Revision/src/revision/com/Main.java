package revision.com;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 5, 1, 7, 12, 23 };
        int n = arr.length;
        Main main = new Main();
        System.out.println("Array before rotating = " + Arrays.toString(arr));
        main.rotate(arr, n, 13);
        System.out.println("Array after rotating = " + Arrays.toString(arr));
    }

    // Revision 16/01/24
    public void reverse(int[] arr, int i, int j) {
        int left = i;
        int right = j;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }

    public void rotate(int arr[], int n, int k) {
        k = (k > n) ? (k % n): k;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // Revision 15/01/24
    // public void mergeSort(int[] arr, int low, int mid, int high) {
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

    // for (int m = low, l = 0; l < merged.length; m++, l++) {
    // arr[m] = merged[l];
    // }
    // }

    // public void merge(int[] arr, int low, int high) {
    // if (low >= high)
    // return;
    // int mid = (low + high) / 2;
    // merge(arr, low, mid);
    // merge(arr, mid + 1, high);
    // mergeSort(arr, low, mid, high);
    // }

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

}