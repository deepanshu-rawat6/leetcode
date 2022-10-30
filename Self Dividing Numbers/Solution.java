/*
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            // check if i is self dividing
            if (helper(i)) {
                // adds i to the list
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean helper(int x) {
        int temp = x;
        while (temp != 0) {
            int r = temp % 10;
            // avoiding zeros and digits that don't divide x
            if (r == 0) {
                return false;
            }else if (x % r != 0) {
                return false;
            }
            temp /= 10;
        }
        // return true, if none of the above conditions are hit
        return true;
    }
}