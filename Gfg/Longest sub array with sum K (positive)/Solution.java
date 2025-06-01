
// User function Template for Java
import java.util.HashMap;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum equals k, update maxLen
            if (sum == k) {
                maxLen = i + 1;
            }

            // If (sum - k) is seen before, subarray with sum k exists
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store the first occurrence of this sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] ques = new int[] { 94, -33, -13, 40, -82, 94, -33, -13, 40, -82 };
        System.out.println(s1.longestSubarray(ques, 52));
    }
}
