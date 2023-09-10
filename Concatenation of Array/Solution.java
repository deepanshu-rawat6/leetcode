class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] new_nums = new int[2 * len];
        for (int i = 0; i < len; i++) {
            new_nums[i] = nums[i];
            new_nums[len + i] = nums[i];
        }
        
        return new_nums;
    }
}