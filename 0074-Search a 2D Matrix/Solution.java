// Approach: Binary Search

/*
 * STEP 1: Using binary search, find the row in which the target element is present.
 * STEP 2: Using binary search, find the column in which the target element is present.
 */

// Time complexity: O(log(mn))
// Space complexity: O(1)



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length, COLS = matrix[0].length;

        int rStart = 0, rEnd = ROWS - 1;
        while (rStart <= rEnd) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (target > matrix[rMid][COLS - 1]) {
                rStart = rMid + 1;
            } else if (target < matrix[rMid][0]) {
                rEnd = rMid - 1;
            } else {
                break;
            }
        }
        if (!(rStart <= rEnd)) {
            return false;
        }

        int correctRow = rStart + (rEnd - rStart) / 2;
        int low = 0, high = COLS - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target > matrix[correctRow][mid]) {
                low = mid + 1;
            } else if (target < matrix[correctRow][mid]) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}