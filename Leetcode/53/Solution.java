class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubSum = nums[0];
        int tempSum = 0;

        for(int num: nums){
            tempSum += num;
            maxSubSum = Math.max(maxSubSum, tempSum);
            if(tempSum < 0){
                tempSum = 0;
            }
        }
        return maxSubSum;
    }
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.maxSubArray(new int[]{1, 0, -1, -5, 9, 19, -19, 25}));
    }
}