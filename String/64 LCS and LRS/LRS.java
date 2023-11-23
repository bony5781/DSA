class LRS {
    public static int longestRepeatingsequence(String text1, String text2) {

        int n1 = text1.length();
        int n2 = text2.length();
        int dp[][] = new int[n1 + 1][n2 + 1];

        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j) && i != j) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        System.out.println(longestRepeatingsequence("axxxy", "axxxy"));
    }
}