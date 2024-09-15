class Solution {
    public List<String> cellsInRange(String s) {
        int rowstart = s.charAt(1) - '0';
        int rowend = s.charAt(4)-'0';
        char columnstart = s.charAt(0);
        char columnend= s.charAt(3);
        
        List <String> res = new ArrayList<>();
        
        for (char ch = columnstart; ch<=columnend; ch++){
            for (int i = rowstart; i<=rowend; i++){
                res.add(String.valueOf(ch)+ String.valueOf(i));
            }
            
        }
        
        return res;
    }
}