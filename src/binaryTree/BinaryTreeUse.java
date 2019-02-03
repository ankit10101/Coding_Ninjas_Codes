package binaryTree;
import java.util.*;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
//		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		Queue<BinaryTreeNode<Integer>> pendingNodes = new Queue<>();
		System.out.println("Enter root data: ");
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enQueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> node = pendingNodes.deQueue();
			System.out.println("Enter left child of " + node.data);
			int leftChildData = s.nextInt();
			if(leftChildData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				node.left = leftChild;
				pendingNodes.enQueue(leftChild);
			}
			System.out.println("Enter right child of " + node.data);
			int rightChildData = s.nextInt();
			if(rightChildData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				node.right = rightChild;
				pendingNodes.enQueue(rightChild);
			}
		}
		return root;
	}

//	public static void print(BinaryTreeNode<Integer> root) {
//		Queue<BinaryTreeNode<Integer>> pendQ = new LinkedList<>();
//        pendQ.add(root);
//        while(!pendQ.isEmpty())
//        {
//        	BinaryTreeNode<Integer> curNode = pendQ.poll();
//        	if(curNode == null && pendQ.isEmpty())
//        		break;
//        	else if(curNode == null)
//        	{
//        		
//        	}
//        	else
//        	{
//        		System.out.print(curNode.data+" :");
//        		if(curNode.left != null)
//        		{
//        			System.out.print(curNode.left.data+" ");
//        			pendQ.add(curNode.left);
//        		}
//        		else
//        			System.out.print("-1 ");
//        		
//        		if(curNode.right != null)
//        		{
//        			System.out.print(curNode.right.data);
//        			pendQ.add(curNode.right);
//        		}
//        		else
//        			System.out.print("-1 ");
//        		System.out.println();
//        	}
//        }
//	}

	public static void preOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);	
	}

	public static void postOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}

	public static void inOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);

	}
	//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		System.out.println("Inorder: ");
		inOrderTraversal(root);
		System.out.println();
		System.out.println("PreOrder: ");
		preOrderTraversal(root);
		System.out.println();
		System.out.println("PostOrder: ");
		postOrderTraversal(root);
		System.out.println();	
//		print(root);
	}
}
