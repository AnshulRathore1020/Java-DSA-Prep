import java.util.LinkedList;
import java.util.Queue;
public class binary {
   
   static class Node{
        int data;
        Node left;
        Node right;
        

        public Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
            

        }
        
    }
    static class binaryt{
       static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
                Node newnNode = new Node(nodes[idx]);
               newnNode.left = buildtree(nodes);
              newnNode.right = buildtree(nodes);
              return newnNode;

        }
       
    }
    //preorder traversal
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //Inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //postorder traversal
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

//level order traversal 
//or isko hm quque se karenge (first in first out properties se )

    public static void levelOrder(Node root){
        if(root == null){
            return ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

      while(!q.isEmpty()){
        Node currNode = q.remove();
        if(currNode == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.print(currNode.data + " ");
            if(currNode.left != null){
                q.add(currNode.left);
            }
            if(currNode.right != null){
                q.add(currNode.right);
            }
        }
      }

   
    }
       //Count Nodes by recursion

      public static int CountNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = CountNodes(root.left);
        int rightNodes = CountNodes(root.right);
        return leftNodes + rightNodes + 1;


      }

      //sum of nodes 
      public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);
        return leftsum + rightsum + root.data;
      }
      
      //height of tree
      public static int height(Node root){
        if(root == null){
            return 0 ;
        }
        int leftheight= height(root.left);
        int rightheight = height(root.right);
        int myheight = Math.max(leftheight, rightheight) +1;
        return myheight;
      }
      //Count Leaf Nodes(nodes with no children)
      public static int CountLeafNodes(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return CountLeafNodes(root.left) + CountLeafNodes(root.right);
      }
        
      //diameter
      //approch 1 time complexcity jyda aa rhi isme
      public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int dia1=diameter(root.left);
        int dia2=diameter(root.right);
        int dia3 = height(root.left) + height(root.right);
        return Math.max(dia3 , Math.max(dia1, dia2));
      }

      //approch 2 kam time complexcity se 
      



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryt t = new binaryt();
       Node root = t.buildtree(nodes);
    //    System.out.println(root.data);
    // preorder(root);
    // inorder(root);
    // postorder(root);
    // levelOrder(root);
    // System.out.println(CountNodes(root));
    // System.out.println(sumOfNodes(root));
    // System.out.println(height(root));
    // System.out.println(diameter(root));
    System.out.println(CountLeafNodes(root));
    }
}
