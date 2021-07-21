/****************************************************************
 * Purpose : Ability to add 22, 40, 11, 3, 16, 60, 95, 65, 63, 67 in the binary search tree
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
		binary.insert(22);
		binary.insert(40);
		binary.insert(11);
		binary.insert(3);
		binary.insert(16);
		binary.insert(60);
		binary.insert(95);
		binary.insert(65);
		binary.insert(63);
		binary.insert(67);
		// Displaying the Binary tree.
		binary.inorderTraversal(binary.root);

	}

}
