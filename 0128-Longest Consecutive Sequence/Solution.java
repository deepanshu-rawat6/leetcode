import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int best = 0, y = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                y = num + 1;
                while (set.contains(y)) {
                    y++;
                }
                best = Math.max(best, y - num);
            }
        }

        return best;
    }
}