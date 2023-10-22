import java.util.*;

class BinarySearch {

    public static int binarysearch(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 0;
    }

    public static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 1, 7, 5, 22, 112 };
        Arrays.sort(arr);
        System.out.println("Sorted array is : ");
        displayArray(arr, arr.length);
        int target = 5;
        System.out.println(binarysearch(arr, arr.length, target));
    }
}