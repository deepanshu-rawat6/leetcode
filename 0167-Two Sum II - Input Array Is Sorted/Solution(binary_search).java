// Approach 1: Binary Search

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0, e = numbers.length-1;
        int temp = 0;
        while(s <= e){
            int mid = s + (e - s) / 2;
            temp = numbers[s] + numbers[e];
            if (temp == target) return new int[]{s + 1,e + 1};
            
            if (temp < target){
                s++;
            }else{
                e--;
            }
        }
        return new int[]{-1,-1};
    }
}

// Approach 2: Binary Search

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                int temp = target - nums[i];
                if (nums[mid] == temp) {
                    return new int[] {i + 1, mid + 1};
                } else if (nums[mid] > temp) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return new int[]{-1, -1};
    }
}
