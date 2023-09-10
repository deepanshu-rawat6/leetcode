/*
DP approach, same as LCS problem, we just compare the value of LCS 
obtained with the length of the string to be compared

TC: O(m*n)
SC: O(m*n)
*/
class Solution {
    public boolean isSubsequence(String s, String t) {
        // m = s.length(), n = t.length()
        int[][] DP = new int[s.length() + 1][t.length() + 1]; 
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= t.length(); j++) {
                if (i == 0 || j == 0) {
                    DP[i][j] = 0;
                } else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    DP[i][j] = DP[i - 1][j - 1] + 1;
                } else {
                    DP[i][j] = Math.max(DP[i - 1][j],DP[i][j - 1]);
                }
            }
        }
        return s.length() == DP[s.length()][t.length()];
    }
}
