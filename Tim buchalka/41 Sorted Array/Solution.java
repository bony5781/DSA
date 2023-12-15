import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[] getIntegers(int n){
        int arr[] = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("Element %d contents %d\n", i, arr[i]);
        }
    }

    public static int[] sortIntegers(int arr[]){
        int arr2[] = Arrays.copyOf(arr, arr.length);
        boolean isSwapped;
        for(int i = 0; i < arr2.length - 1; i++){
            isSwapped = false;
            for(int j = 0; j < arr2.length - i - 1; j++){
                if(arr2[j] < arr2[j + 1]){
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                    isSwapped = true;
                }
            }
        }

        return arr2;
    }

    public static void main(String[] args) {
        int arr[] = getIntegers(5);
        printArray(arr);
        arr = sortIntegers(arr);
        printArray(arr);
    }
}
