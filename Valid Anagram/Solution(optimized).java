class Solution {
    public boolean isAnagram(String s, String t) {
        int s_length = s.length();
        int t_length = t.length();

        if (s_length != t_length) {
            return false;
        } else {
            int[] freq_arr = new int[26];

            for (int i = 0; i < s_length; i++) {
                freq_arr[s.charAt(i) - 'a']++;
                freq_arr[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                if (freq_arr[i] != 0) {
                    return false;
                }
            }

            return true;
        }
        // O(N) [time] and O (N) [space]
    }
}