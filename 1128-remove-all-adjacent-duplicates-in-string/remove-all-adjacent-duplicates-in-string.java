class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st  = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            checksum(ch,st);
        }
        StringBuilder ans = new StringBuilder();

for (char ch : st) {
    ans.append(ch);
}

return ans.toString();
    }
    public void checksum(char ch,Stack<Character>st){
        if(st.size()==0){
            st.push(ch);
            return;
        }
        else{
            char c = st.peek();
            if(c == ch){
                st.pop();
                return;
            }
            else{
                st.push(ch);
            }
        }
    }

}