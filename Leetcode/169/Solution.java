class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.majorityElement(new int[]{1,1,3,1,1,2}));
    }
}
