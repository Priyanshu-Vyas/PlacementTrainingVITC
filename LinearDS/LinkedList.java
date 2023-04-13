class Node {
    int data;
    Node next;
    public Node(int item) {
        data=item;
        next=null;
    }
}

class LinkedList {
    public static void main(String[] args) {
        Node head=new Node(0);
        head.next=new Node(1);
        head.next.next=new Node(2);

        while(head!=null) {
            System.out.println(head.data);
            head=head.next;
        }
        
    }
}