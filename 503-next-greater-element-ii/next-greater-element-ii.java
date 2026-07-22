class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            st.push(arr[i]);
        }
        int [] nge  = new int[n];
        
        for(int i = n-1;i>=0;i--) {
            while (st.size() > 0 && arr[i] >= st.peek()) st.pop();
            if(st.size()==0) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
    }
    return nge;
}
}