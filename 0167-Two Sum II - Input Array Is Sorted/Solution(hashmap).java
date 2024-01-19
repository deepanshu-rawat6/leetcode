class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) return new int[] {map.get(target - nums[i]), i + 1};
            map.putIfAbsent(nums[i], i + 1);
        }

        return new int[] {-1,-1};
    }
}