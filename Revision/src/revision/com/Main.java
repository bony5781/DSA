package revision.com;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public int partition(int[] arr, int low, int high){
        int i = low - 1;
        int pivot = arr[high];
        for(int j = low; j < high; j++){
            if(pivot > arr[j]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public void quickSort(int[] arr, int low, int high){
        if(low >= high) return;
        int pvtidx = partition(arr, low, high);
        quickSort(arr, low, pvtidx - 1);
        quickSort(arr, pvtidx + 1, high);
    }

    //Insertion sort 3/01/2024
//    public void insertionSort(int[] arr, int n){
//        for(int i = 1; i < n; i++){
//            int curr = arr[i];
//            int j = i - 1;
//            while(j >= 0 && curr <= arr[j]){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = curr;
//        }
//    }

    //Union of 2 arrays
//    public int doUnion(int[] a, int n, int[] b, int m){
//        HashMap<Integer, Integer> hmap = new HashMap<>();
//        for(int i = 0; i < n; i++){
//            hmap.put(a[i],i);
//        }
//        for(int i = 0; i < m; i++){
//            hmap.put(b[i],i);
//        }
//
//        return hmap.size();
//    }

    public static void main(String[] args) {
        int[] arr1 = {-10, -2, -3, -4};
        int n = arr1.length;
        Main main = new Main();
        System.out.println("Array before sorting = " + Arrays.toString(arr1));
        main.quickSort(arr1, 0, n - 1);
        System.out.println("Array after sorting = " + Arrays.toString(arr1));
    }
}