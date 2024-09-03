class Solution {
    public int repeatedStringMatch(String a, String b) {
         String str = a;
        int aa = a.length();
        int bb = b.length();
        int cc = bb/aa;
       int count = 1;
            
            
            for (int i = 0;i<cc+2; i++){
                if(a.contains(b)){
                    return count;
                }
                else{
                    a+=str;
                    count++;
                    
                    
                }
                
            }
        return -1;
    }
}