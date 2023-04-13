public class Queue {
    int front=-1,rear=-1,n=3;
    int[] a=new int[n];
    boolean isempty() {
        if(front==rear && rear==-1)
            return true;
        else
            return false;
    }
    boolean isfull() {
        if(front==0 && rear==n-1)
            return true;
        else
            return false;
    }
    void enqueue(int d) {
        if(!isfull()) {
            if(front==-1)
                front=0;
            a[++rear]=d;
        }
    }
    void dequeue() {
        if(!isempty()) {
            front++;
        }
    }
    void peek() {
        System.out.println(a[rear]);
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.peek();
        q.dequeue();
        q.peek();
    } 
}
