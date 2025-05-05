import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - temp) < Math.abs(target - closest)) {
                    closest = temp;
                }
                if (temp < target) {
                    left++;
                } else if (temp > target) {
                    right--;
                } else {
                    return target;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int nums[] = {-1, 2, 1, -4};
        System.out.println(s1.threeSumClosest( nums, 1));
    }
}
