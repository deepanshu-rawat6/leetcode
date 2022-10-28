class Solution {
    public int findMiddleIndex(int[] nums) {
        int len = nums.length;
        int left = 0, right = 0;
        for (int i : nums) {
            right += i;
        }
        for (int i = 0; i < len ; i++) {
            right -= nums[i];
            if (left == right) {
                return i;
            }
            left +=nums[i];
        }
        return -1;
    }
}