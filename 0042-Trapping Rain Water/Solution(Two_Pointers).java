// Approach: Two Pointers
class Solution {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int i = 0, j = height.length - 1;
        int Lmax = height[i], Rmax = height[j];
        int area = 0;

        while (i < j) {
            if (Lmax < Rmax) {
                i++;
                Lmax = Math.max(Lmax, height[i]);
                area += Lmax - height[i];
            } else {
                j--;
                Rmax = Math.max(Rmax, height[j]);
                area += Rmax - height[j];
            }
        }

        return area;
    }
}