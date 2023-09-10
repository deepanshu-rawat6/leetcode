class Solution {
    public boolean isAnagram(String s, String t) {
        // First Check: If length are not equal return false
        if (s.length() != t.length()) {
            return false;
        }

        // Converting to char array
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        // Sotring both arrays
        Arrays.sort(string1);
        Arrays.sort(string2);

        // Traversing to find a not equal check, then return false
        for (int i = 0; i < string1.length; i++) {
            if (string1[i] != string2[i]) {
                return false;
            }
        }

        // If none of the checks are triggered, then return true
        return true;

        // O(N log N) [time] and O (N) [space]
    }
}