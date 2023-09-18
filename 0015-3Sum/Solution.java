// Approach: Two Pointers

/*
 * Using HashSet to avoid duplicate triplets
 */

public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();

    Arrays.sort(nums);

    int len = nums.length;

    for (int i = 0; i < len - 1; i++) {

        int j = i + 1, k = len - 1;

        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];

            if (sum == 0) {
                set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            } else if (sum > 0) {
                k--;
            } else {
                j++;
            }
        }
    }

    list.addAll(set);

    return list;
}

// Time complexity: O(n^2)
// Space complexity: O(n)

/*
 * In this approach, instead of using a HashSet to avoid duplicate pairs, we can simply skip the equal elemenets to avoid duplicate triplets.
 */


// Approach: Two Pointers (Optimized)

    public static List<List<Integer>> ThreeSumOptimized(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> resultList = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    resultList.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    j++;
                    k--;

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return resultList;
    }

// Time complexity: O(n^2)
// Space complexity: O(n)
