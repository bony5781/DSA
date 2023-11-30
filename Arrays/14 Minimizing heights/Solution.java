import java.util.Arrays;

class Solution {
    public static int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];

        int low = arr[0] + k;
        int high = arr[n - 1] - k;
        int mi, ma;

        for (int i = 0; i < n - 1; i++) {
            mi = Math.min(low, arr[i + 1] - k);
            ma = Math.max(high, arr[i] + k);
            if (mi < 0)
                continue;
            ans = Math.min(ans, ma - mi);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 10, 6, 4, 6, 9, 1 };
        System.out.println(getMinDiff(arr, 8, 7));
    }
}