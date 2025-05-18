import java.util.Arrays;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left = 0, right = 1, i = 0;
        int ans[] = new int[nums.length];
        while (i < nums.length) {
            if (nums[i] > 0) {
                ans[left] = nums[i];
                left += 2;
            }
            if (nums[i] < 0) {
                ans[right] = nums[i];
                right += 2;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(Arrays.toString(s1.rearrangeArray(new int[] { 3, 1, -2, -5, 2, -4 })));
    }
}