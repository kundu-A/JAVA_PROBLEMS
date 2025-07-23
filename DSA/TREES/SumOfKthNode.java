import java.util.LinkedList;
import java.util.Queue;

public class SumOfKthNode {
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
        public static int sumOfKthLevel(Node root,int k){
            if(root==null)
                return 0;
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            int level=0;
            while(!queue.isEmpty()){
                int size=queue.size();
                int levelSum=0;

                for(int i=0;i<size;i++){
                    Node currentNode=queue.poll();
                    if(level==k)
                        levelSum=levelSum+currentNode.data;
                    if(currentNode.left!=null)
                        queue.add(currentNode.left);
                    if(currentNode.right!=null)
                        queue.add(currentNode.right);
                }

                if(level==k)
                    return levelSum;
                level++;
            }
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] mainTree={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
        Node root = BuildBinaryTree.createTree(mainTree);
        //Level start from 0.
        int k=1;
        int result=BuildBinaryTree.sumOfKthLevel(root, k);
        System.out.println(result);
    }
}
