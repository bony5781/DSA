package revision.com;


import java.util.Arrays;

public class Main {

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //DSA Babbar sheet 09 26-12-23
    public void sort012(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        int i = 0;
        while (i <= high) {
            if(arr[i] == 0){
                swap(arr, low, i);
                low ++;  i++;
            }else if(arr[i] == 1){
                i ++;
            }else if(arr[i] == 2) {
                swap(arr, high, i);
                high--;
            }
        }
    }
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
        int n = arr.length;
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        Main rv = new Main();
        rv.sort012(arr, n);
        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }
}