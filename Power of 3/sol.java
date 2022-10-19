class Solution {
    public boolean isPowerOfThree(int n) {
        return helper(n);
    }
    public boolean helper(int n){
        if(n <= 0) return false;
        if(n % 3 == 0) return helper(n / 3);
        if(n == 1) return true;
        return false;
    }
}