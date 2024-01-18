package revision.com;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String P = "aabca";
        String Q = "bacaa";
        // int[] arr = { 5, 1, 7, 12, 23, 7, -1 };
        // int n = arr.length;
        Main main = new Main();
        // System.out.println("Array before sorting = " + Arrays.toString(arr));
        // main.quickSort(arr, 0, n - 1);
        // System.out.println("Array after sorting = " + Arrays.toString(arr));
        System.out.println(main.isCyclicRotation(P, Q));
    }

    // Revision 18/01/24
    public  int isCyclicRotation(String p, String q)  {
        int ans = (p+p).indexOf(q) != -1 ? 1 : 0;
        return ans;
    }

    // Revision 17/01/24
    // public int partition(int[] arr, int low, int high){
    //     int pivot = arr[high];
    //     int i = low - 1;
    //     for(int j = low; j < high; j++){
    //         if(arr[j] < pivot){
    //             i++;
    //             int temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }
    //     i++;
    //     int temp = arr[high];
    //     arr[high] = arr[i];
    //     arr[i] = temp;
    //     return i;
    // }

    // public void quickSort(int[] arr, int low, int high) {
    //     if(low < high) {
    //         int pvtidx = partition(arr, low, high);
    //         quickSort(arr, low, pvtidx - 1);
    //         quickSort(arr, pvtidx + 1, high);
    //     }
    // }

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

    // for (int l = 0, m = low; l < merged.length; l++, m++) {
    // arr[m] = merged[l];
    // }
    // }

    // public void mergeSort(int[] arr, int low, int high) {
    // if (low >= high)
    // return;
    // int mid = low + (high - low) / 2;
    // mergeSort(arr, low, mid);
    // mergeSort(arr, mid + 1, high);
    // merge(arr, low, mid, high);
    // }

    // public void insertionSort(int[] arr, int n) {
    // for (int i = 0; i < n; i++) {
    // int curr = arr[i];
    // int j = i - 1;
    // while (j >= 0 && curr < arr[j]) {
    // arr[j + 1] = arr[j];
    // j--;
    // }
    // arr[j + 1] = curr;
    // }
    // }

    // Revision 16/01/24
    // public void reverse(int[] arr, int i, int j) {
    // int left = i;
    // int right = j;
    // while (left < right) {
    // int temp = arr[left];
    // arr[left] = arr[right];
    // arr[right] = temp;
    // left++; right--;
    // }
    // }

    // public void rotate(int arr[], int n, int k) {
    // k = (k > n) ? (k % n): k;
    // reverse(arr, 0, n - 1);
    // reverse(arr, 0, k - 1);
    // reverse(arr, k, n - 1);
    // }

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