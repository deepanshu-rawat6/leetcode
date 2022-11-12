/*
 * Time Complexity: O(m log n)
 * Space Complexity: O(1)
 */
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length , n = grid[0].length;
        for (int[] ints : grid) {
            count += binary_search(ints);
        }
        return count;
    }
    public int binary_search(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= 0) {
                s = mid + 1;
            } else {
               e = mid - 1;
            }
        }
        return arr.length - e - 1;
    }
}