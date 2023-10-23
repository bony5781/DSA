class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int maxSoFar = 0;

        for(int i = 0; i < n; i++){
            maxSoFar += nums[i];
            max = Math.max(max, maxSoFar);
            if(maxSoFar < 0) maxSoFar = 0;
        }

        return max;
    }
}