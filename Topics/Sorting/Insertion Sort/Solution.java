import java.util.Arrays;

public class Solution {

    public void insertionSort(int[] arr, int n){
        for(int i = 1; i < n; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current <= arr[j]){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4,7,5,9,9,0,12,3};
        int n = arr.length;
        Solution s = new Solution();
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        s.insertionSort(arr, n);
        System.out.println("Array before sorting : " + Arrays.toString(arr));
    }
}
