// Approach: Brute Force

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {

            for (int j = i; j < n; j++) {

                int sum = nums[j] + nums[j - i];

                if (sum == target) {
                    return new int[]{j - i, j};
                }

            }
        }

        return null;
    }
}

// Time complexity: O(n^2)
// Space complexity: O(1)