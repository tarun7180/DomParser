package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTreeTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void levelOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data);
		Queue<Node> levelQueue = new LinkedList<Node>();
		Node tempNode = root;
		if (tempNode.left != null) {
			levelQueue.add(tempNode.left);
		}
		if (tempNode.right != null) {
			levelQueue.add(tempNode.right);
		}
		while (levelQueue.peek() != null) {
			tempNode = levelQueue.remove();
			System.out.print(" " + tempNode.data);
			if (tempNode.left != null) {
				levelQueue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				levelQueue.add(tempNode.right);
			}
		}
	}

}
