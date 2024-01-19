class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i] + nums[j];
            if (temp == target) {
                return new int[]{i + 1, j + 1};
            } else if (temp > target) {
                j--;
            } else  {
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}