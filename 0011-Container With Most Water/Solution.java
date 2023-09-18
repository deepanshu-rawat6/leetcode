// Approach: Two Pointers

/*
 * Using two pointers to maximum container area
 */

public static int maxArea(int[] height) {
    int i = 0, j = height.length - 1, maxArea = 0;

    while (i < j) {
        maxArea = Math.max(maxArea, Math.min(height[i] , height[j]) * (j - i));

        if (height[i] > height[j]) {
            j--;
        } else {
            i++;
        }
    }

    return maxArea;
}

// Time complexity: O(n)
// Space complexity: O(1)