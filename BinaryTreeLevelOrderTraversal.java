import java.util.*;
import java.io.*;
/**Binary Tree Level Order Traversal
* "Given a pointer to the root of a binary tree, you need to print the level order traversal of this tree. 
* In level-order traversal, nodes are visited level by level from left to right. Complete the function
* and print the values in a single line separated by a space."
 */

//Method provided by HackerRank
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    
    //Method to implement
	public static void levelOrder(Node root) {
        if (root == null){
            return;
        }
      
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        
        while (!queue.isEmpty()){
            Node current_node = queue.poll();
            System.out.print(current_node.data + " ");
            
            if (current_node.left != null){
                queue.add(current_node.left);
            }
            if (current_node.right != null){
                queue.add(current_node.right);
            }
        }
      
    }

    //Methods provided by HackerRank
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }	
}