class Solution {
    public static void parenthesis(int n, int l,int r,List<String> ans,String s){
        if(r == n){
            ans.add(s);
            return;
        }
        if(l<n) parenthesis(n,l+1,r,ans,s+"(");
        if(l>r) parenthesis(n,l,r+1,ans,s+")");
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans =  new ArrayList<>();

        parenthesis(n,0,0,ans,"");
        return ans;
    }
}