import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    list.add(1);
                }else{
                    list.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(list);
        }
        return ans;
    }
}