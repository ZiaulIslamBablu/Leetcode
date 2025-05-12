class Solution {
    public String removeDuplicateLetters(String s) {
        int [] lastindex = new int [26];
        for (int i =0; i<s.length(); i++){
            lastindex[s.charAt(i)-'a']=i;
        }

        boolean[] seen = new boolean[26]; // keep track seen
        Stack<Integer> st = new Stack();
        for (int i =0; i<s.length(); i++){
            int curr = s.charAt(i)-'a';
            if(seen[curr]) continue;

           while (!st.isEmpty() && st.peek() > curr && i < lastindex[st.peek()]){
                seen[st.pop()] = false; // pop out and mark unseen
            }
            st.push(curr); // add into stack
            seen[curr] = true; // mark seen

        }
         StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append((char) (st.pop() + 'a'));
        return sb.reverse().toString();
    }
}