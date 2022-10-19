class Solution {
    public boolean isPowerOfThree(int n) {
        return helper(n);
    }
    public boolean helper(int n){
        double p = Math.log10(n) / Math.log10(3);
        if(p == (int)p){
            return true;
        }else{
            return false;
        }
    }
}