class Solution {

    public int reverse(int x) {
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            int remainder = temp % 10;
            temp = temp / 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10) && remainder > 7)
                return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10) && remainder < 8)
                return 0;
            reverse = reverse * 10 + remainder;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.reverse(-123));
    }
}