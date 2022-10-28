class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber != 0){
            columnNumber--;
            char chr = (char)('A' + columnNumber % 26);
            sb.append(chr);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}