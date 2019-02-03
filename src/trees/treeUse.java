package trees;
import java.util.Scanner;
public class treeUse {
// Method to take input level wise	
	public static treeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		Queue_generic<treeNode<Integer>> pendingNodes = new Queue_generic<>();
	    System.out.println("Enter root data");
		int rootData = s.nextInt();
		treeNode<Integer> root = new treeNode<Integer>(rootData);
		pendingNodes.enQueue(root);
		while(!pendingNodes.isEmpty()){
			treeNode<Integer> node = pendingNodes.deQueue();
			System.out.println("Enter the no of children of " + node.data);
			int numChild = s.nextInt();
			for(int i = 0;i < numChild;i++) {
				int childData = s.nextInt();
				treeNode<Integer> child  = new treeNode<Integer>(childData);
				node.children.add(child);
				pendingNodes.enQueue(child);
			}
		}
		return root;
	}
	
//	public static treeNode<Integer> takeInput() {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the root data");
//		int rootData = s.nextInt();
//		treeNode<Integer> root = new treeNode<>(rootData);
//		int noOfChildren;
//		System.out.println("Enter the number of children of " + rootData);
//		noOfChildren = s.nextInt();
//		for(int i = 0;i < noOfChildren;i++) {
//			treeNode<Integer> ithChild = takeInput();
//			root.children.add(ithChild);
//		}
//		return root;
//	}
	
	public static void print(treeNode<Integer> root) {
		System.out.print(root.data + ":");
		for(treeNode<Integer> child : root.children) {
			System.out.print(child.data + " ");
		}
		System.out.println();
		for(treeNode<Integer> child : root.children) {
			print(child);
		}
	}

	public static void main(String[] args) {
		treeNode<Integer> root  = takeInputLevelWise();
        print(root);
	}
}
