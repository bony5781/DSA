import java.util.HashMap;

class Solution {
    // 6 -10 -4 -6
    // Function to check whether there is a subarray present with 0-sum or not.
    public static boolean findsum(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int currSum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) return true;
            currSum += arr[i];
            hmap.put(currSum,i);
            if(hmap.containsKey(-arr[i]) || hmap.containsKey(-currSum)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 2, -3, 1, 6 };
        int n = arr.length;
        Solution s = new Solution();
        System.out.println(s.findsum(arr, n));
    }
}