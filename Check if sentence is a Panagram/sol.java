class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(int i=0;i<26;i++){
            if(sentence.indexOf((char)i+97)<0) return false;
        }
        return true;
    }
}