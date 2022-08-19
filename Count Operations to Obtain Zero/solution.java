// Optimized Solution
class Solution {
    public int countOperations(int num1, int num2) {
        return calculate(num1,num2);
    }
    public int calculate(int n1,int n2){
        if(n1*n2==0) return 0;
        return n1/n2+calculate(n2,n1%n2);
    }
}
// Learned new approach through discussion forums
// Similar to Euclidean Algorithm -> O(log(min(A,B)))