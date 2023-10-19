import java.util.*;

class Solution {

    public static boolean checkLength(String s1, String s2, String result) {
        return ((s1.length() + s2.length()) == result.length());
    }

    public static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        s = String.valueOf(charArray);
        return s;
    }

    public static boolean checkValidShuffle(String s1, String s2, String result) {
        if (checkLength(s1, s2, result) == false) {
            return false;
        }

        s1 = sortString(s1);
        s2 = sortString(s2);
        result = sortString(result);

        int i = 0, j = 0, k = 0;
        while (k != result.length()) {
            if (i < s1.length() && s1.charAt(i) == result.charAt(k)) {
                i++;
            } else if (j < s2.length() && s2.charAt(j) == result.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }

        if (i < s1.length() || j < s2.length()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Potato");
        String result = new String("oPotatolleH");
        System.out.print(checkValidShuffle(s1, s2, result));
    }
}