class Solution {

    /* This solution gives TC : O(m X n ) 
     * DP approach
    */
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int[][] DP = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j ==0) {
                    DP[i][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    DP[i][j] = DP[i - 1][j - 1] + 1;
                } else {
                    DP[i][j] = Math.max(DP[i][j - 1],DP[i - 1][j]);
                }
            }
        }
        return DP[m][n];
    }

    /* This solution gives TC : O(m X n ) , but a little slower than DP approach
     * Memoization approach
    */
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int m = text1.length();
    //     int n = text2.length();
    //     int[][] dp = new int[m + 1][n + 1];
    //     for(int[] rows : dp) {
    //         Arrays.fill(rows, -1);
    //     }
    //     return lcs(text1,m,text2,n,dp);
    // }

    // public int lcs(String text1,int m,String text2,int n,int[][] dp) {
    //     if (m == 0 || n == 0) {
    //         return 0;
    //     }
    //     if (dp[m - 1][n - 1] != -1) {
    //         return dp[m - 1][n - 1];
    //     }
    //     if(text1.charAt(m - 1) == text2.charAt(n - 1)) {
    //         dp[m - 1][n - 1] = 1 + lcs(text1,m - 1,text2,n - 1,dp);
    //         return dp[m - 1][n - 1];
    //     } else {
    //         dp[m - 1][n - 1] = Math.max(lcs(text1,m,text2,n - 1,dp),lcs(text1,m - 1,text2,n,dp)); 
    //         return dp[m - 1][n - 1];
    //     }
    // }




    /* This solution gives TC : O(2 ^ (m + n)) 
     * Backtracking approach
    */
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int m = text1.length();
    //     int n = text2.length();
    //     return lcs(text1,m,text2,n);
    // }
    // public int lcs(String text1,int m,String text2,int n) {
    //     if (m == 0 || n == 0) {
    //         return  0;
    //     }
    //     if (text1.charAt(m - 1) == text2.charAt(n - 1)) {
    //         return 1 + lcs(text1,m - 1,text2,n - 1);
    //     } else {
    //         return Math.max(lcs(text1,m - 1,text2,n),lcs(text1,m,text2,n - 1));
    //     }
    // }
}

