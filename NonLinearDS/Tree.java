package NonLinearDS;
class Node {
    int key;
    Node left,right;
    public Node(int item) {
        key=item;
        left=right=null;
    }
}

public class Tree {
    Node root;
    Tree() {
        root=null;
    }
    void preorder(Node node) {
        if(node==null)
            return;
        System.out.println(node.key+" ");
        preorder(node.left);
        preorder(node.right);
    }
    void inorder(Node node) {
        if(node==null)
            return;
        inorder(node.left);
        System.out.println(node.key+" ");
        inorder(node.right);
    }
    void postorder(Node node) {
        if(node==null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.key+" ");
    }
    int depth(Node root) {
        if(root==null)
            return 0;
        int ld=depth(root.left);
        int rd=depth(root.right);
        return Math.max(ld,rd)+1;
    }
    public static void main(String[] args) {
        Tree t=new Tree();
        t.root=new Node(0);
        t.root.left=new Node(1);
        t.root.right=new Node(2);
        t.preorder(t.root);
        t.inorder(t.root);
        t.postorder(t.root);
        System.out.println(t.depth(t.root));
    }
}