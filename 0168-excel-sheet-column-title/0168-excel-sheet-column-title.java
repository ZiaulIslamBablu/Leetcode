class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ss = new StringBuilder ();
        while (columnNumber>0){
            int r = (columnNumber-1)%26;
            ss.append ((char)(r+'A'));
            columnNumber = (columnNumber-1)/26;
            
            
        }
        return ss.reverse().toString();
    }
}