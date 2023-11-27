class Solution {
    public static int maxSubStr(String str) {
        // Write your code here
        int counter = 0;
        int n = str.length();
        int i = 0;

        while (i < n) {
            int zeroCount = 0;
            int oneCount = 0;

            if (i < n && str.charAt(i) == '0') {
                while (i < n && str.charAt(i) == '0') {
                    zeroCount++;
                    i += 1;
                }
                while (i < n && str.charAt(i) == '1') {
                    oneCount++;
                    i += 1;
                }
            }else {
                while (i < n && str.charAt(i) == '1') {
                    oneCount++;
                    i += 1;
                }
                while (i < n && str.charAt(i) == '0') {
                    zeroCount++;
                    i += 1;
                }
            }

            if (zeroCount == oneCount) {
                counter++;
            }

        }

        return counter;

    }

    public static void main(String[] args) {
        System.out.println(maxSubStr("0101111111110"));
    }
}