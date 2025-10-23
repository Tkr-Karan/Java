package Client;

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
	
	public static void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
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
	
	public static void main(String[] args) {		
		Node rootNode = new Node(16);
		Node rootNode1 = new Node(1);
		Node rootNode2 = new Node(2);
		Node rootNode3 = new Node(3);
		Node rootNode4 = new Node(4);
		
		
		rootNode.left = rootNode2;
		rootNode.right = rootNode1;
		
		rootNode2.left = rootNode3;
		rootNode3.left = rootNode4;
		
//		preOrder(rootNode);
//		System.out.println();
//		inOrder(rootNode);
//		System.out.println();
//		postOrder(rootNode);
//		System.out.println();
//		
//		System.out.println(heightOfTree(rootNode));
		
		int treeSize = sizeOfTree(rootNode);
		System.out.println("Size of Tree ---> " + treeSize);
		
		int treeSum = sumOfTree(rootNode);
		System.out.println("Sum of Tree is ---> " + treeSum);
		
		makeDataValueUpdate(rootNode, 1);
		
		preOrder(rootNode);
		
		
	}
}