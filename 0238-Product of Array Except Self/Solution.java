// Approaches

// Initial Approach

// Initially, we can take nested loops to calculate the product of the array and excluding the ith element if we are calculating for nums[i]. But this will take O(n^2) time complexity.

// Division Approach

// Calculating the product of the array, and then dividing with the ith element if we are calculating for nums[i]. But this will fail if there are any 0's in the array.

// Optmized Approach

/*
 * In this approach, we take the prefix product of the array and store it in an array Lprod. 
 * Then we take the suffix product of the array and store it in an array Rprod. 
 * Then we multiply the ith element of Lprod and Rprod to get the product of the array except self for the ith element.
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] Lprod = new int[len];
        int[] Rprod = new int[len];

        int[] resultArr = new int[len];

        Lprod[0] = 1;
        Rprod[len - 1] = 1;

        for (int i = 1; i <= len - 1 ; i++) {
            Lprod[i] = Lprod[i - 1] * nums[i - 1];
        }

        for (int i = len - 2; i >= 0; i--) {
            Rprod[i] = Rprod[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < len; i++) {
            resultArr[i] = Lprod[i] * Rprod[i];
        }

        return resultArr;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)

// Optmized Approach without using extra space

/*
 * In this approach, we take the prefix product of the array and store it in an array resultArr.
 * Then we take a variable R and initialize it to 1.
 * Then we iterate the array from the end and multiply the ith element of resultArr with R and store it in the ith element of resultArr.
 * Then we multiply R with the ith element of nums.
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] resultArr = new int[len];

        resultArr[0] = 1;

        for (int i = 1; i <= len - 1; i++) {
            resultArr[i] = resultArr[i - 1] * nums[i - 1];
        }

        int R = 1;

        for (int i = len - 1; i >= 0; i--) {
            resultArr[i] = resultArr[i] * R;
            R *= nums[i];
        }

        return resultArr;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
