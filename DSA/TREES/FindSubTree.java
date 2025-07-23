public class FindSubTree {
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

        public static boolean isIdentical(Node mainRootNode,Node subRootNode){
            if(mainRootNode==null && subRootNode==null)
                return true;
            if(mainRootNode==null || subRootNode==null)
                return false;
            if(mainRootNode.data==subRootNode.data){
            return isIdentical(mainRootNode.left, subRootNode.left) &&
                isIdentical(mainRootNode.right, subRootNode.right);
            }
            return false;
        }
        public static boolean isSubTree(Node mainRootNode,Node subRootNode){
            if(subRootNode==null)
                return true;
            if(mainRootNode==null)
                return false;
            if(mainRootNode.data==subRootNode.data){
                if(isIdentical(mainRootNode, subRootNode))
                    return true;
            }

            return isSubTree(mainRootNode.left, subRootNode) ||
                isSubTree(mainRootNode.right, subRootNode);
        }
    }
    public static void main(String[] args) {
        int[] mainTree={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] subTree={2, 4, -1, -1, 5, -1, -1};
        Node mainRootNode = BuildBinaryTree.createTree(mainTree);
        BuildBinaryTree.index=-1;
        Node subRootNode = BuildBinaryTree.createTree(subTree);
        boolean result =BuildBinaryTree.isSubTree(mainRootNode, subRootNode);
        System.out.println(result);
    }
}
