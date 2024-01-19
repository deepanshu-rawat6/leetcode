// Solution

// Group the strings by their sorted values, by indexing instead of sorting strings to reduce time complexity, and then return the values of the map.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] ca = new char[26];
            for (char c : s.toCharArray()) {
                ca[c - 'a']++;
            }

            String keyStr = String.valueOf(ca);

            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());

            map.get(keyStr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

// Time Complexity: O(N * K)
// Space Complexity: O(N * K)