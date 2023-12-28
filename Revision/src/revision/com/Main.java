package revision.com;


import java.util.Arrays;

public class Main {

    //Kadane's Algorithm 28-02-23
    public int kadan(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < n; i++){
            currSum += arr[i];

            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0) currSum = 0;
        }

        return maxSum;
    }

//    public void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

//    public void merge(int[] arr, int low, int mid, int high) {
//        int[] arr2 = new int[high - low + 1];
//        int i = 0, j = mid + 1;
//        int k = 0;
//        while (i <= mid && j <= high) {
//            if (arr[i] > arr[j]) {
//                arr2[k++] = arr[j++];
//            } else {
//                arr2[k++] = arr[i++];
//            }
//        }
//
//        while (i <= mid) {
//            arr2[k++] = arr[i++];
//        }
//
//        while (j <= high) {
//            arr2[k++] = arr[j++];
//        }
//
//        for (int m = low, l = 0; m <= arr2.length; l++, m++) {
//            arr[l] = arr2[m];
//        }
//
//    }

    //Merge Sort 27-12-23
//    public void mergeSort(int[] arr, int low, int high) {
//
//        if (low >= high) return;
//
//        int mid = low + (high - low) / 2;
//        mergeSort(arr, low, mid);
//        mergeSort(arr, mid + 1, high);
//        merge(arr, low, mid, high);
//
//    }

    //DSA Babbar sheet 09 26-12-23
    //Bubble Sort 25-12-23
//    public void BubbleSort(int[] arr, int n){
//
//        boolean swapped;
//        for(int i = 0; i < n - 1; i++){
//            swapped = false;
//            for(int j = 0; j < n - i - 1; j++){
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if(swapped == false) break;
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {-10, -2, -3, -4};
        int n = arr.length ;
        Main rv = new Main();
        System.out.println("Maximum subarray : " + rv.kadan(arr, n));
    }
}