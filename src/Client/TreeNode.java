package Client;

import java.util.ArrayList;
import java.util.List;

class Node {
	public int data;
	public Node left;
	public Node right;
	
	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	
	public static void printTree(Node root) {
		
		if(root != null) {
			
			printTree(root.left);
			System.out.print(root.data + " ");			
			printTree(root.right);
		}
	}
}



public class TreeNode{	
	
	public static void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void inOrder(Node root, List<Integer> al) {
		if(root != null) {
			inOrder(root.left, al);
			System.out.print(root.data + " ");
			al.add(root.data);
			inOrder(root.right, al);
		}
	}
	
	public static void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public static int heightOfTree(Node root) {
		if(root == null) return -1;
		
		int left = heightOfTree(root.left);
		int right = heightOfTree(root.right);
		
		return Math.max(left, right) + 1;
	}
	
	public static int sizeOfTree(Node root) {
		if(root == null) return 0;
		
		int left = sizeOfTree(root.left);
		int right = sizeOfTree(root.right);
		
		return left + right + 1;
	}
	
	public static int sumOfTree(Node root) {
		if(root == null) return 0;
		
		int left = sumOfTree(root.left);
		int right = sumOfTree(root.right);
		
		return left + right + root.data;
	}
	
	
	public static void makeDataValueUpdate(Node root, int level) {
		if(root == null) return;
		if(level == 0) {
			root.data = -1;
			return; // here adding check for the early exit
		}
		
		makeDataValueUpdate(root.left, level - 1);
		makeDataValueUpdate(root.right, level - 1);
	}
	
	public static boolean isSameTree(Node root1, Node root2) {
		if(root1 == null && root2 == null) return true;
		if(root1 == null || root2 == null) return false;
		
		if(root1.data == root2.data && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right)) return true;
		
		
		return false;
		
	}
	
	public static void invertTree(Node root) {
		if(root == null) return;
		
		swapTree(root);
		invertTree(root.left);
		invertTree(root.right);
		
	}
	
	public static void swapTree(Node root) {
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	
	public static boolean searchInBST(Node root, int target) {
		if(root == null) return false;
		
		if(root.data == target) return true;
		
		if(root.data < target) return searchInBST(root.right, target);
		else return searchInBST(root.left, target);
		
	}
	
	public static boolean isSorted(List<Integer> arr) {
		if(arr == null || arr.size() <= 1) return true;
	    
	    for(int i = 0; i < arr.size() - 1; i++) {
	        if(arr.get(i) > arr.get(i + 1)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {		
		Node rootNode = new Node(16);
		Node rootNode1 = new Node(1);
		Node rootNode2 = new Node(2);
		Node rootNode3 = new Node(3);
		Node rootNode4 = new Node(4);
		
		
		rootNode.left = rootNode2;
		rootNode2.left = rootNode1;
		
		rootNode2.right = rootNode3;
		rootNode3.right = rootNode4;
		
		
		// second Tree
		Node root = new Node(16);
		Node root1 = new Node(1);
		Node root2 = new Node(2);
		Node root3 = new Node(3);
		Node root4 = new Node(4);
		
		
		root.left = root2;
		root.right = root1;
		
		root2.left = root3;
		root3.left = root4;
		
		
//		preOrder(rootNode);
//		System.out.println();
//		inOrder(rootNode);
//		System.out.println();
//		postOrder(rootNode);
//		System.out.println();
//		
//		System.out.println(heightOfTree(rootNode));
		
		int treeSize = sizeOfTree(rootNode);
//		System.out.println("Size of Tree ---> " + treeSize);
		
		int treeSum = sumOfTree(rootNode);
//		System.out.println("Sum of Tree is ---> " + treeSum);
		
//		makeDataValueUpdate(rootNode, 1);
		
//		preOrder(rootNode);
//		System.out.println();
//		preOrder(root);
//		
//		
//		boolean isSame = isSameTree(rootNode, root);
//		
//		System.out.println();
//		
//		System.out.println("Is Tree Same or Not : " + isSame);
//		
//		invertTree(rootNode);
//		
//		System.out.println();
//		
//		preOrder(rootNode);
//		
//		System.out.println();
		
		List<Integer> al = new ArrayList<>();
		inOrder(rootNode, al);
		
		System.out.println();
		
		System.out.println(al);
		
//		System.out.println(searchInBST(rootNode, 3));
		
		boolean isSortedBST = isSorted(al);
		
		System.out.println("This BST is Sorted : " + isSortedBST);
		System.out.println(searchInBST(rootNode, 3));
		
		
	}
}