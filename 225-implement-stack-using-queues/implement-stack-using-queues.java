class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for(int i = 1;i<q.size();i++){
            q.add(q.poll());
        }
        int pop = q.poll();
        return pop;  
    }
    
    public int top() {
        for(int i = 1;i<q.size();i++){
            q.add(q.poll());
        }
        int top = q.peek();
        q.add(q.poll());
        return top;
        
    }
    
    public boolean empty() {
        return (q.size()==0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */