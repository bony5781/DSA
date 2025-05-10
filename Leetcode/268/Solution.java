class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumN = n * (n + 1) / 2;
        int sumT = 0;
        for(int num: nums) sumT += num;
        return sumN - sumT;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.missingNumber(new int[]{ 0, 3, 1}));
    }
}