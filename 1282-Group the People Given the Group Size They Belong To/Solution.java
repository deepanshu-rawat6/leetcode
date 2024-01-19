// Solution

// Group the people to the indexes and then filter into the arralist of the group size, and if group size is greater than 3, then separate into the groups of 3 and add to the list

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if(!map.containsKey(groupSizes[i])) {
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
        }

        List<List<Integer>> list = new ArrayList<>();

        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            int groupSize = entry.getKey();
            ArrayList<Integer> members = entry.getValue();

            for (int i = 0; i < members.size(); i += groupSize) {
                List<Integer> group = new ArrayList<>(members.subList(i, i + groupSize));
                list.add(group);
            }
        }

        return list;       
    }
}

// O(n) time complexity
// O(n) space complexity