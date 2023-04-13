public class Stack {
    int top=-1,n=3;
    int[] a=new int[n];
    public boolean isempty() {
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isfull(){
        if(top==n-1)
            return true;
        else
            return false;
    }
    public void push(int d) {
        if(!isfull()) {
            a[++top] = d;
        }
    }
    public void pop(){
        if(!isempty()) {
            top--;
        }
    }
    public void peek(){
        System.out.println(a[top]);
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(4);
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        s.push(3);
        s.peek();
        s.pop();
        s.peek();
    }
}
