package problem135_CommonChild;

class CommonChild {

    public static void main(String[] args) {
        System.out.println(commonChild( "HARRY", "SALLY" ));
        System.out.println(commonChild( "AA", "BB" ));
        System.out.println(commonChild( "SHINCHAN", "NOHARAAA" ));
        System.out.println(commonChild( "ABCDEF", "FBDAMN" ));
    }

    private static int commonChild(String s1, String s2) {
        int n = s1.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // diagonal
                } else {
                    dp[i][j] = Math.max(
                            dp[i - 1][j],   // up
                            dp[i][j - 1]    // left
                    );
                }
            }
        }

        return dp[n][n];
    }

}