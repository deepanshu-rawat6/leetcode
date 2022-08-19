// Brute Force, Recursive 
class Solution {
    public int countOperations(int num1, int num2) {
        return calculate(num1,num2);
    }
    public int calculate(int num1,int num2){
        return helper(num1,num2,0);
    }
    public int helper(int n1,int n2,int c){
        if(n1==0 || n2==0) return c;
        if(n1>=n2) return helper(n1-n2,n2,c+1);
        else return helper(n1,n2-n1,c+1);
    }
}