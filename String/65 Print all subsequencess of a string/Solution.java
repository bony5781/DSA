import java.lang.Math;

class Solution {

    public static void printAllSubsequences(String s) {

        int upperLimit = (int) Math.pow(2, s.length()) - 1;

        for (int i = 0; i <= upperLimit; i++) {
            String sub = "";
            for (int j = 0; j <= s.length() - 1; j++) {
                if ((i & (1 << j)) != 0) {
                    sub += s.charAt(j);
                }
            }
            System.out.println(sub);
        }
    }

    public static void main(String[] args) {
        printAllSubsequences("abc");
    }
}