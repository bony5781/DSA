import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    int lastLeftOccurrence = nums[left];
                    int lastRightOccurrence = nums[right];

                    while (left < right && nums[left] == lastLeftOccurrence) {
                        left++;
                    }

                    while (left < right && nums[right] == lastRightOccurrence) {
                        right--;
                    }
                }

            }
        }

        return ans;
    }
}