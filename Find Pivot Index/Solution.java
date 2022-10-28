class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int right_sum = 0, left_sum = 0;
        for (int i : nums) {
            right_sum += i;
        }
        for (int i = 0; i < len ; i++) {
            right_sum -= nums[i];
            if (left_sum == right_sum) {
                return i;
            }
            left_sum += nums[i];
        }
        return -1;
    }
}