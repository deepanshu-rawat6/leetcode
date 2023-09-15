// Approach: HashMap

/*
 * Using hashmap to store the index of the number and check if the target - number is in the map.
 */

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

// TC : O(n)
// SC : O(n)

// Approach: Binary Search

/*
 * Iterating into the array to find the target - nums[i] th element in the array using binary search.
 */

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

// TC : O(nlogn)
// SC : O(1)

// Most optimal solution
// Approach: Two Pointers

/*
 * Using two pointers to find the sum of the elements at the start and end of the array.
 */

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

// TC : O(n)
// SC : O(1)