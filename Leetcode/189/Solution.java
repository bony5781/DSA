class Solution {

    public void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    
    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
