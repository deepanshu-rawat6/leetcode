class Solution {
    public int countDigits(int num) {
        if (num >= 1 && num <= 10) {
            return 1;
        } else {
            int c = 0;
            int temp = num;
            while (temp != 0) {
                int r = temp % 10;
                if (r == 0) {
                    continue;
                }
                if (num % r == 0) {
                    c++;
                }
                temp /= 10;
            }
            return c;
        }
    }
}