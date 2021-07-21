/****************************************************************
 * Purpose : Ability to create a BST by adding 56 and then adding 30 & 70
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class BinarySearchTreeRunner {

	public static void main(String[] args) {

		BinarySearchOperation binary = new BinarySearchOperation();
		// Inserting data.
		binary.insert(56);
		binary.insert(30);
		binary.insert(70);
		// Displaying the Binary tree.
		binary.inorderTraversal(binary.root);

	}

}
