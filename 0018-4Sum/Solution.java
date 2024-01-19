import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int l = nums.length - 1; l >= 0; l--) {
                int j = i + 1, k = l - 1;
                while (j < k) {
                    sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        set.add(Arrays.asList(nums[i] ,nums[j] ,nums[k] ,nums[l]));
                        j++;
                        k--;
                    } else if (sum > target) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>(set);

        return list;
    }
}