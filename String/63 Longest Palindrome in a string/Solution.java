class Solution{
    static String longestPalin(String S){
        if (S == null || S.length() == 0) {
            return "";
        }
        String longest = "";
        for (int i = 0; i < S.length(); i++) {
            // For odd-length palindromes
            String palindrome1 = expandAroundCenter(S, i, i);
            if (palindrome1.length() > longest.length()) {
                longest = palindrome1;
            }
            // For even-length palindromes
            String palindrome2 = expandAroundCenter(S, i, i + 1);
            if (palindrome2.length() > longest.length()) {
                longest = palindrome2;
            }
        }
        return longest;
    }
   public static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}