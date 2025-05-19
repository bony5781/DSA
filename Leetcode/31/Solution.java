import java.util.Arrays;

class Solution {

    // Swap elements
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse array
    public void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;

        // Find the largest index i such that A[i] >= A[i + 1]
        int i = n - 1;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If no such i exists, reverse the array and return
        if (i == -1) {
            reverse(nums, 0, n);
            return;
        }

        // Find the largest index j such that j > i and A[j] > A[i]
        int j = n;
        while (nums[j] <= nums[i]) {
            j--;
        }

        // Swap
        swap(nums, j, i);

        // Reverse
        reverse(nums, i + 1, n);

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.nextPermutation(new int[] { 1, 2, 3 });
    }
}