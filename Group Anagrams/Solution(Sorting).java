// Solution:

// Group the strings by their sorted values, and then return the values of the map.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);

            String keyStr = String.valueOf(ca);

            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());

            map.get(keyStr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

// Time Complexity: O(N * KlogK)
// Space Complexity: O(N * K)