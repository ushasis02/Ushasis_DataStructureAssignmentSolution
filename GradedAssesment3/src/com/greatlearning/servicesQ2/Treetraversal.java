package com.greatlearning.servicesQ2;
import com.greatlearnin.driverQ2.SkewedBST;

public class Treetraversal {
    public static Node newroot;
	
    public static Node infixtraversal(Node root) {
	if (root.left==null && root.right==null) {
		//System.out.print(root.data + " ");
		insertnode(root.data);
		return root;
	  } else if(root.left!=null)
		  infixtraversal(root.left);
	//System.out.print(root.data + " ");
	insertnode(root.data);
	if(root.right !=null)
		infixtraversal(root.right);
	return root;
	}

   public static Node insertnode (int data) {
	 Node temp = newroot; 
	 if (newroot == null)
		 {newroot = new Node(data);
		 return newroot;
		 }
	else
		{
		 while (temp.right !=null)
			 temp = temp.right;
		temp.right = new Node(data);
		}
		return newroot;
   }
}

