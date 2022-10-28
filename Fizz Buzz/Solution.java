import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ans=new ArrayList<>();
        int t=1;
        while(t<=n){
            if(t%3==0 && t%5==0) ans.add("FizzBuzz");
            else if(t%5==0) ans.add("Buzz");
            else if(t%3==0) ans.add("Fizz");
            else ans.add(Integer.toString(t));
            t++;
        }
        return ans;
    }
}