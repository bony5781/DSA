import java.util.Arrays;

public class Main {

    public void reverse(int arr[]){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        int arr[] = { 1, 2, 3, 4, 5};
        m.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
