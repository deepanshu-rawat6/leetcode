// Iterative approach
class solution {
    public int numberOfSteps(int num) {
        return calculate(num);
    }
    public int calculate(int num){
        int c=0;
        while(num!=0){
            if((num&1)==0) num/=2;
            else num-=1;
            c++;
        }
        return c++;
    }
}