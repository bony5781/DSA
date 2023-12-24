import java.util.ArrayList;

public class Main {

    //All occurrences of linear Search
    public int[] linearSearchImproved(int[] arr, int n, int target){
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                arr2.add(i);
            }
        }

        n = arr2.size();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] =arr2.get(i);
        }

        return ans;
    }

//    23-12-23
//    public int binarySearch(int arr[], int n, int target){
//        int low = 0;
//        int high = n - 1;
//        int mid = low + (high - low) / 2;
//        while(low <= high){
//            mid = low + (high - low) / 2;
//            if(arr[mid] == target){
//                return mid;
//            }else if(arr[mid] > target){
//                high = mid - 1;
//            }else{
//                low = mid + 1;
//            }
//        }
//
//        return -1;
//    }

    //21-12-23
//    public static int linearSearch(int arr[], int n,int target){
//        for(int i = 0; i < n; i++){
//            if(arr[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4, 5, 6, 6, 7, 8, 9};
        int n = arr.length;
        Main rv = new Main();
        int[] res = rv.linearSearchImproved(arr, n, 6);
        int n1 = res.length;
        if(n1 != 0){
            System.out.print("Element found at index");
            for (int re : res) {
                System.out.printf(" %d, ", re);
            }
        }else{
            System.out.print("Element not found");
        }

    }
}