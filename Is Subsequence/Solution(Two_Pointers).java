/*
Two Pointers approach: 
TC: O(max(m,n))
SC: O(1)
*/
class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0,j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == m;
    }
}
