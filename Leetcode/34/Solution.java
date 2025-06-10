class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find the first occurrence
        result[0] = findFirst(nums, target);

        // If the first occurrence is not found, the target is not in the array
        if (result[0] == -1) {
            return result;
        }

        // Find the last occurrence
        result[1] = findLast(nums, target);

        return result;
    }

    private int findFirst(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid; // Potential first occurrence
                right = mid - 1; // Try to find an even earlier one
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    private int findLast(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid; // Potential last occurrence
                left = mid + 1; // Try to find an even later one
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}