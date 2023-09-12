// Approach

// Sorting the arrays, to get reduce complexity and then comparing only the first and last strings whether there exist a common prefix or not.


class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else {
                break;
            }
        }

        return str1.substring(0,i);
    }
}

// Time Complexity : O(nlogn) + O(n) = O(nlogn)
// Space Complexity : O(1)