class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR each number
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.singleNumber(new int[]{1,1,3,5,3,5,4,6,6}));
    }
}