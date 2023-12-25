package revision.com;


import java.util.Arrays;

public class Main {

    //Bubble Sort 25-12-23
    public void BubbleSort(int[] arr, int n){

        boolean swapped;
        for(int i = 0; i < n - 1; i++){
            swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 7, 1, 99, 4};
        int n = arr.length;
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        Main rv = new Main();
        rv.BubbleSort(arr, n);
        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }
}