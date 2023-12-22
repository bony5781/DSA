import java.util.Scanner;

public class Main {

    public class MinimumElement {
        // write code here
        private static int readInteger(){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            return n;
        }

        private static int[] readElements(int n){
            Scanner sc = new Scanner(System.in);
            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            return arr;
        }

        private static int findMin(int arr[]){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < arr.length; i++){
                min = Math.min(arr[i], min);
            }

            return min;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}