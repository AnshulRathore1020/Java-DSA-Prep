
class Node{
    int data;
    Node left,right;

    Node(int val){
        this.data = val;
        this.left = null;
        this.right = null;

    }
}
public class IdenticalTree {
    public boolean isIdentical(Node p , Node q){

        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){ 
            return false;
        }

        if(p.data != q.data){
            return false;
        }
        return isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }

    public static void main(String[] args) {
        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);

         Node t2 = new Node(1);
        t2.left = new Node(2);
        t2.right = new Node(3);

        IdenticalTree tree = new IdenticalTree();
        System.out.println(tree.isIdentical(t1, t2));
    }
}
