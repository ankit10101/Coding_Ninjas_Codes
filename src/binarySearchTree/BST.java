/*
BST Class

Implement the BST class which includes following functions -

1. search
Given an element, find if that is present in BSt or not. Return true or false.

2. insert -
Given an element, insert that element in the BST at the correct position. 
Assume unique elements will be given.

3. delete -
Given an element, remove that element from the BST. 
If the element which is to be deleted has both children, 
replace that with the minimum element from right sub-tree.

4. printTree (recursive) -

Print the BST in in the following format -
For printing a node with data N, you need to follow the exact format -

N:L:x,R:y

where, N is data of any node present in the binary tree. x and y are the values of left and right child 
of node N. Print the children only if it is not null.
There is no space in between.
You need to print all nodes in the recursive format in different lines.
 */
package binarySearchTree;
public class BST {
	private BinaryTreeNode<Integer> root;
	
	public  BST() {
		root = null;
	}	
	
	public boolean search(int data) {
		return search(root, data);
	}
	
	private boolean search(BinaryTreeNode<Integer> root, int data) {
		if(root == null) {
			return false;
		}
		if(root.data == data) {
			return true;
		}
		else if(data < root.data) {
			return search( root.left,data);
		}
		else {
			return search(root.right,data);
		}
	}
	
	public void insertData(int data) {
		this.root = insertData(root,data);
	}
	
	private BinaryTreeNode<Integer> insertData(BinaryTreeNode<Integer> root , int data) {
		if(root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}else if(data < root.data) {
			root.left = insertData(root.left,data);
			return root;
		}else {
			root.right = insertData(root.right,data);
			return root;
		}
	}
	
	public void deleteData(int data) {
		deleteData(root,data);
	}
	
	private BinaryTreeNode<Integer> deleteData(BinaryTreeNode<Integer> root, int data){
		if(root == null) {
			return null;
		}
		if(data < root.data) {
			root.left =  deleteData(root.left, data);
			return root;
		}else if(data > root.data) {
			root.right = deleteData(root.right, data);
			return root;
		}else {
			if(root.left == null && root.right == null) {
				return null;
			}else if(root.right == null) {
				return root.left;
			}else if(root.left == null) {
				return root.right;
			}else{
				root.data = findSuccessor(root).data;
				root.right = deleteData(root.right,root.data);
				return root;
			}
		}
	}
	
	private BinaryTreeNode<Integer> findSuccessor(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return null;
		}
		BinaryTreeNode<Integer> temp = root.right;
		while(temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}
	
	public void printTree() {
		printTree(root);
	}
	
	private void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		String toBePrinted = root.data + ":";
		if(root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		if(root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
}


