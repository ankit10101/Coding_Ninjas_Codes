package binaryTree;

public class Level_order_traversal {

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> q = new Queue<>();
        q.enQueue(root);
        while(q != null){
            BinaryTreeNode<Integer> node = q.deQueue();
            if(node.left != null) {

                q.enQueue(node.left);
            }
            if(node.right != null) {

                q.enQueue(node.right);
            }
        }

    }
}
