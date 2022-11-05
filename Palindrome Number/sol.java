class Solution {
    public static boolean isPalindrome(int x) {
        int n = x;
        int num = 0;
        while(n > 0) {
            num = num * 10 + (n % 10);
            n /= 10;
        }
        return num == x;
    }
}