
import java.util.LinkedList;
import java.util.Queue;

public class binary {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
      
    static class binaryclass{
        static int index = -1;
        public static Node buildtree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;


        }
    }
    //preorder

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    //Inorder
     public static void Inorder(Node root){
        if(root == null){
            return;
        }
        
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    
    }
    //postorders
    public static void postorder(Node root){
        if(root == null){
            return ;
        }
        postorder(root.right);
        postorder(root.left);
        System.out.print(root.data + " ");
    }

    //level
    public static void level(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node newNode=q.remove();
            if(newNode == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                System.out.print(newNode.data + " ");
             if(newNode.left != null){
                q.add(newNode.left);
             }
             if(newNode.right != null){
                q.add(newNode.right);
             }
            }
        }
        
    }

        

        //count 
       public static int count(Node root){
        if(root == null ){
            return 0;
        }
        int left=count(root.left);
        int right=count(root.right);
        return left+right+1;
       }

        //sum
        public static int sumnodes(Node root){
            if(root == null){
                return 0;
            }
            int leftsum = sumnodes(root.left);
            int rightsum = sumnodes(root.right);
            return leftsum + rightsum + root.data;
        }
        //height
        public static int heightOfnodes(Node root){
            if(root == null){
                return 0;
            }
            int leftheight = heightOfnodes(root.left);
            int rightheight =  heightOfnodes(root.right);
            return Math.max(leftheight, leftheight) + 1;
        }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryclass t = new binaryclass();
        Node root = t.buildtree(nodes);
        System.out.println("Level order");
        level(root);
        
    }
}
