package revision.com;


import java.util.Arrays;

public class Main {

//    public void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    public void merge(int[] arr, int low, int mid, int high) {
        int[] arr2 = new int[high - low + 1];
        int i = 0, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] > arr[j]) {
                arr2[k++] = arr[j++];
            } else {
                arr2[k++] = arr[i++];
            }
        }

        while (i <= mid) {
            arr2[k++] = arr[i++];
        }

        while (j <= high) {
            arr2[k++] = arr[j++];
        }

        for (int m = low, l = 0; m <= arr2.length; l++, m++) {
            arr[l] = arr2[m];
        }

    }

    //Merge Sort 27-12-23
    public void mergeSort(int[] arr, int low, int high) {

        if (low >= high) return;

        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

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
        int[] arr = {0, 1, 0};
        int n = arr.length - 1;
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        Main rv = new Main();
        rv.mergeSort(arr, 0, n);
        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }
}