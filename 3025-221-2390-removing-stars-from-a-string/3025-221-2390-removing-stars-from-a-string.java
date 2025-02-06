class Solution {
    public String removeStars(String s) {
        StringBuilder ss = new StringBuilder ();
            
            for (int i =0; i<s.length(); i++){
                    if (s.charAt(i) == '*'){
                            ss.deleteCharAt(ss.length()-1);
                    }
                    else{
                            ss.append(s.charAt(i));
                    }
            }
            return ss.toString();
    }
}