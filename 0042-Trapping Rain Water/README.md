Link to the problem : https://leetcode.com/problems/trapping-rain-water/description/

Approach : 1 (Two Pointers)

- Based on the max elements from the left and right sides.
- If the Lmax is smaller than Rmax, then increment from the left side to fill the area such that the water stays trapped. Constantly check for Lmax being smaller than other element.
- Otherwise the Rmax is smaller then proceed to decrement from the right side to the fill the area. Constantly check for Rmax being smaller than other element.
- Now, iterate through the array, and proceeds with the min(leftMax[i], rightMax[i]), then calculate area from subtracting height[i] from the smaller one of them.
- Repeat till right pointer is less than left pointer.

Approach : 2 (Max_Element)

- First calculate the max element throught the array, from the left side.
- Then repeat for finding the max element throughtout the array, from the right side.
- Now, iterate through the array, and proceeds with the min(leftMax[i], rightMax[i]), then calculate area from subtracting height[i] from the smaller one of them.