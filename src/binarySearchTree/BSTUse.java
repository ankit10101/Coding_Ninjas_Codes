package binarySearchTree;
public class BSTUse {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insertData(100);
		bst.insertData(150);
		bst.insertData(50);
		bst.insertData(25);
		bst.insertData(120);
		bst.insertData(180);
		bst.printTree();
		bst.deleteData(50);
	}
}
