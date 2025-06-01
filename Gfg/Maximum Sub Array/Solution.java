import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        int maxSum = -1;
        int currSum = 0;
        int start = 0;
        int maxStart = -1, maxEnd = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                currSum = 0;
                start = i + 1;
                continue;
            }

            currSum += arr[i];

            // Check for update
            if (currSum > maxSum || 
               (currSum == maxSum && (i - start > maxEnd - maxStart))) {
                maxSum = currSum;
                maxStart = start;
                maxEnd = i;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if (maxStart == -1) {
            ans.add(-1);
        } else {
            for (int i = maxStart; i <= maxEnd; i++) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.findSubarray(new int[] { 1, 2, 5, -7, 2, 6 }));
    }
}