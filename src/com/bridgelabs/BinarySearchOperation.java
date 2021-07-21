/****************************************************************
 * Purpose : To create methods to perform Binary search.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class BinarySearchOperation {
	Node root;

	public BinarySearchOperation() {
		this.root = null;
	}

	/*
	 * Purpose: Method to insert data.
	 * 
	 * @param data: key to be inserted
	 */
	public void insert(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return;
		}

		else {
			Node current = root;
			Node parent = null;
			while (true) {
				parent = current;
				// Assigning data to left subtree.
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				}
				// Assigning data to right subtree.
				else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	/*
	 * Purpose: Method to display inserted data.
	 * 
	 * @param node
	 */
	public void inorderTraversal(Node node) {
		if (root == null)
			System.out.println("Tree is empty");
		else {
			if (node.left != null)
				inorderTraversal(node.left);
			System.out.print(node.data + " ");
			if (node.right != null)
				inorderTraversal(node.right);
		}
	}

	/*
	 * Purpose: Method to search data in BST.
	 * 
	 * @param node
	 * 
	 * @param value: data to find.
	 */
	public Node searchNode(Node root, int value) {
		if (root == null || root.data == value)
			return root;

		if (root.data > value)
			return searchNode(root.left, value);

		return searchNode(root.right, value);
	}

	public boolean search(int value) {
		root = searchNode(root, value);
		if (root != null)
			return true;
		else
			return false;
	}

}
