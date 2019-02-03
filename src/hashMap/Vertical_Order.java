/*
Vertical Order

Given a binary tree, print that binary tree in vertical order. Vertical order is -
Print the nodes which are at same vertical order in same line separated by space. 
Print different levels in different lines.
Order of different levels in different lines is not important. 
But in one level, print the element in pre-order format.

Input Format :
Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place

Output Format :
Required output in given format

Sample Input :
1 2 3 4 5 6 7 -1 8 -1 -1 -1 -1 -1 -1 -1 -1

Sample Output :
7 
3 
4 
2 8 
1 5 6 

 */
package hashMap;
import java.util.HashMap;

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class Vertical_Order {
	
	public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
