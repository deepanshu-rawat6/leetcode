import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> ans=new HashSet<>();
        String[] memorize=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String l:words){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < l.length(); ++i)
                sb.append(memorize[l.charAt(i) - 'a']);
            ans.add(sb.toString());
        }
        return ans.size();
    }
}