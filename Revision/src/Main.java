import java.util.Arrays;

public class Main {

    //21-12-23
    public static int linearSearch(int arr[], int n,int target){
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {7, 2, 9,  1, 6, 9, 9};
        int n = arr.length;
        Main rv = new Main();
        int res = linearSearch(arr, n, 6);
        if(res != -1){
            System.out.printf("Element first found at index %d.", res);
        }else{
            System.out.printf("Element not found", res);
        }

    }
}