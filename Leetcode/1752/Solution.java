class Solution {
    public boolean check(int[] nums) {
        boolean isRotatedAlready = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (isRotatedAlready)
                    return false;
                if (i < nums.length && nums[nums.length - 1] > nums[0])
                    return false;
                isRotatedAlready = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.check(new int[] { 2, 3, 5, 7 }));
    }
}