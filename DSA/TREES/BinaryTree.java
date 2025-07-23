import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
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
    static class BuildBinaryTree{
        //This method is returning the root node.
        static int index=-1;
        public static Node createTree(int[] nodes){
            index++;
            if(nodes[index]==-1)
                return null;
            Node newNode=new Node(nodes[index]);
            newNode.left=createTree(nodes); 
            newNode.right=createTree(nodes);
            
            return newNode;
        }

        //PreOrder - Root-LeftSubTree-RightSubTree
        //Why the name is PreOrder - because root will be considered at first.
        //Time complexity - O(n) -> because we travers each and every node.
        //It works like DFS - Depth First Search
        public static void preOrderTraversal(Node root){
            if(root==null)
                return;
            System.out.print(root.data+"->");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        //PreOrder - LeftSubTree-Root-RightSubTree
        //Why the name is InOrder - because root will be considered at middle.
        //Time complexity - O(n) -> because we travers each and every node.
        //It works like DFS - Depth First Search
        public static void inOrderTraversal(Node root){
            if(root==null)
                return;
            inOrderTraversal(root.left);
            System.out.print(root.data+"->");
            inOrderTraversal(root.right);
        }

        //PreOrder - LeftSubTree-RightSubTree-Root
        //Why the name is PostOrder - because root will be considered at last.
        //Time complexity - O(n) -> because we travers each and every node.
        //It works like DFS - Depth First Search
        public static void postOrderTraversal(Node root){
            if(root==null)
                return;
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+"->");
        }

        //LevelOrder - 1st Level->2nd Level->3rd Level->.....->Nth Level
        //Why the name is LevelOrder - because travers level wise.
        //Time complexity - O(n) -> because we travers each and every node.
        //It works like BFS - Breadth First Search
        /*It will prints like -  1->
                            2->3->
                            4->5->6->*/
        public static void levelOrderTraversal(Node root){
            if(root==null)
                return;
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()) {
                Node currentNode=queue.remove();
                if(currentNode==null){
                    System.out.println();
                    if(queue.isEmpty())
                        break;
                    else
                        queue.add(null);
                }else{
                    System.out.print(currentNode.data+"->");
                    if(currentNode.left!=null)
                        queue.add(currentNode.left);
                    if(currentNode.right!=null)
                        queue.add(currentNode.right);
                }
            }
        }

        //Time Complexity = O(n)
        public static int countNodes(Node root){
            if(root==null)
                return 0;
            int countOfLeftNodes=countNodes(root.left);
            int countOfRightNodes=countNodes(root.right);
            return countOfLeftNodes+countOfRightNodes+1;
        }

        //Time Complexity = O(n)
        public static int sumOfNodes(Node root){
            if(root==null)
                return 0;
            int sumOfLeftNodes=sumOfNodes(root.left);
            int sumOfRightNodes=sumOfNodes(root.right);

            return sumOfLeftNodes+sumOfRightNodes+root.data;
        }

        //Time Complexity = O(n)
        public static int heightOfTree(Node root){
            if(root==null)
                return 0;
            int leftHeight=heightOfTree(root.left);
            int rightHeight=heightOfTree(root.right);
            int totalHeight=Math.max(leftHeight, rightHeight)+1;
            return totalHeight;
        }

        //Approach 1: Time Complexity = O(n^2)
        public static int diameterOfTree(Node root){
            if(root==null)
                return 0;

            int diameter1=diameterOfTree(root.left);
            int diameter2=diameterOfTree(root.right);
            int diameter3=heightOfTree(root.left)+heightOfTree(root.right)+1;

            return Math.max(diameter3,Math.max(diameter1, diameter2));
        }

        //Approach 2: Time complexity = O(n)
        public static TreeInfo diameterOfTree2(Node root){
            if(root==null)
                return new TreeInfo(0, 0);
            TreeInfo leftInfo=diameterOfTree2(root.left);
            TreeInfo rightInfo=diameterOfTree2(root.right);
            int myHeight=Math.max(leftInfo.height, rightInfo.height)+1;
            int dia1=leftInfo.diameter;
            int dia2=rightInfo.diameter;
            int dia3=leftInfo.height+rightInfo.height+1;
            int myDiameter=Math.max((Math.max(dia1, dia2)),dia3);
            TreeInfo treeInfo=new TreeInfo(myHeight, myDiameter);
            return treeInfo;
        }
        static class TreeInfo{
            int height;
            int diameter;
            public TreeInfo(int height,int diameter){
                this.height=height;
                this.diameter=diameter;
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node rootNode = BuildBinaryTree.createTree(nodes);
        
        System.out.println("Your root node = "+rootNode.data);
        System.out.println("\n******************************************");

        System.out.println("PreOrder Traversal: ");
        BuildBinaryTree.preOrderTraversal(rootNode);
        System.out.println("\n******************************************");

        System.out.println("InOrder Traversal: ");
        BuildBinaryTree.inOrderTraversal(rootNode);
        System.out.println("\n******************************************");

        System.out.println("PostOrder Traversal: ");
        BuildBinaryTree.postOrderTraversal(rootNode);
        System.out.println("\n******************************************");

        System.out.println("LevelOrder Traversal: ");
        BuildBinaryTree.levelOrderTraversal(rootNode);
        System.out.println("\n******************************************");

        System.out.print("Total Number of nodes = "
        +BuildBinaryTree.countNodes(rootNode));
        System.out.println("\n******************************************");

        System.out.print("Sum of total nodes = "
        +BuildBinaryTree.sumOfNodes(rootNode));
        System.out.println("\n******************************************");

        System.out.print("Total height of the tree = "
        +BuildBinaryTree.heightOfTree(rootNode));
        System.out.println("\n******************************************");

        System.out.print("Diameter of approach 1: "
        +BuildBinaryTree.diameterOfTree(rootNode));
        System.out.println("\n******************************************");

        System.out.print("Diameter of approach 2: "
        +BuildBinaryTree.diameterOfTree2(rootNode).diameter);
        System.out.println("\n******************************************");

    }
}
