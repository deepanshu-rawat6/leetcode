class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            int temp_hr = 0;

            // System.out.println("\nLeft: " + left + " Right: " + right);

            for (int pile : piles) {
                temp_hr += (int) Math.ceil((double) pile / mid);
                // System.out.println(temp_hr);
            }


            // System.out.println("Mid: " + mid + " Temp_Hr: " + temp_hr);


            if (temp_hr <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}
