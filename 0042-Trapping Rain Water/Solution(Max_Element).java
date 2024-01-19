// Approach: Max Element
class Solution {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
    
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
    
        int Lmax = height[0];
        int Rmax = height[height.length - 1];
        int area = 0;
    
        for (int i = 0; i < height.length; i++) {
            if (Lmax < height[i]) {
                Lmax = height[i];
            }
            leftMax[i] = Math.max(Lmax, height[i]);
            rightMax[height.length - 1 - i] = Math.max(Rmax, height[height.length - 1]);
        }
    
        for (int i = height.length - 1; i >= 0; i--) {
            if (Rmax < height[i]) {
                Rmax = height[i];
            }
            rightMax[i] = Math.max(Rmax, height[i]);
        }
    
        for (int i = 0; i < height.length; i++) {
            if (leftMax[i] < rightMax[i]) {
                area += leftMax[i] - height[i];
            } else {
                area += rightMax[i] - height[i];
            }
        }
    
        return area;
    }
}