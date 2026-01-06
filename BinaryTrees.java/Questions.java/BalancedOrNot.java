


class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
        this.data = val;
        this.left= null;
        this.right = null;

    }
}

public class BalancedOrNot {
  public static boolean isbalanced(Node root){
    return checkHieght(root) != -1;
  }
    private static int checkHieght(Node node){
        if(node == null){
            return 0;
        }
        int leftnode = checkHieght(node.left);
        if(leftnode == -1){
            return -1;
        }
        int rightnode=checkHieght(node.right);
        if(rightnode == -1){
            return -1;
        }
        if(Math.abs(leftnode - rightnode) > 1){
            return -1;
        }
        return Math.max(leftnode, rightnode) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left =new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);
        System.out.println("Is tree Balanced : "+ isbalanced(root));
    }
}

