class Node{
    int data;
    Node left,right;

    Node(int val){
        this.data= val;
        left = right =null;
    }
}

public class TreeDiameter {
    static int maxDiameter = 0;

    public static int diameter(Node root){
        maxDiameter = 0;
        height(root);

        return maxDiameter;
    }
    public static int height(Node node){
        if(node == null){
            return 0;
        }
        int leftheight = height(node.left);
        int rightheight = height(node.right);

        int diaThorughNode = leftheight + rightheight +1;

        maxDiameter = Math.max(maxDiameter, diaThorughNode);

        return Math.max(leftheight, leftheight) + 1;

    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter (in nodes): " + diameter(root));
    }
}
