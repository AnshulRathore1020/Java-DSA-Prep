import java.util.*;

class Node{
    int data;
    Node left,right;
    Node(int val){
        this.data = val;
        left = right = null;
    }
}

public class LeftView {
    public static void printleftview(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelesize = q.size();

            for(int i=0 ; i < levelesize ; i++){
                Node currunt = q.poll();
                if(i == 0){
                    System.out.println(currunt.data + " ");
                }
                if(currunt.left != null){
                    q.add(currunt.left);
                }
                if(currunt.right != null){
                    q.add(currunt.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        System.out.println("left view :" );
        printleftview(root);
    }

}
