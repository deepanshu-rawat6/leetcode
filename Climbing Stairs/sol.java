class Solution {
    int[] steps=new int[50];
    public int climbStairs(int n) {
        steps[1]=1;
        steps[2]=2;
        steps[3]=3;
        for(int i=4;i<50;i++){
            steps[i]=steps[i-1]+steps[i-2];
        }
        return steps[n];
    }
}