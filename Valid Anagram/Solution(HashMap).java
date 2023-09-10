class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for (char chr : s.toCharArray()) {
            if (map.containsKey(chr)) {
                map.put(chr, map.get(chr) + 1);
            } else {
                map.put(chr, 1);
            }
        }

        for (char chr : t.toCharArray()) {
            if (!map.containsKey(chr)) {
                return false;
            } else {
                map.put(chr, map.get(chr) - 1);
            }
        }

        for (Integer val : map.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
        // Time O(N) and Space O(N)
    }
}