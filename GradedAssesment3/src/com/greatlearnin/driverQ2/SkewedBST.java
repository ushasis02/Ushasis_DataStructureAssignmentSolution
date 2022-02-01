package com.greatlearnin.driverQ2;

import com.greatlearning.servicesQ2.Node;
import com.greatlearning.servicesQ2.Treetraversal;

public class SkewedBST {

	public Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define tree
		
		SkewedBST tree = new SkewedBST();
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		//tree.root.left.right = new Node(31);
		tree.root.right.left = new Node(55);
		//tree.root.right.right = new Node(61);
		
		SkewedBST newtree = new SkewedBST();
		//do infix traversal of the tree and create new rightskew tree
		Treetraversal treetraversal = new Treetraversal();
		treetraversal.infixtraversal(tree.root);
		newtree.root = treetraversal.newroot;
						
		//display new tree
		System.out.print("\n" + newtree.root.data + " ");
		Node temp2 = newtree.root.right;
		while (temp2!=null) {
			System.out.print(temp2.data + " ");
			temp2 = temp2.right;
		}
	}
}
