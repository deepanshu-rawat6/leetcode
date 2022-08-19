// Recursive Solution
class Solution {
    public int numberOfSteps(int num) {
        return calculate(num);
    }
    public int calculate(int n){
        return helper(n,0);
    }
    public int helper(int n,int c){
        if(n==0) return c;
        if((n&1)==0) return helper(n/2,c+1);
        else return helper(n-1,c+1);
    }
}
// special concept of passing value to above function calls
// to obtain such results we need to passing the value as arguments in function calls
