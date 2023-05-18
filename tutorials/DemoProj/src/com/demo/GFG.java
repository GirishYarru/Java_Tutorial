package com.demo;

class GFG {
	
	static class NodeTemp
	{
		int data;
		NodeTemp next, child;
		public NodeTemp(int data)
		{
			this.data = data;
			next = child = null;
		}
	}
	
	// Adds a sibling to a list with starting with n
	static public NodeTemp addSibling(NodeTemp node, int data)
	{
		if(node == null)
			return null;
		while(node.next != null)
			node = node.next;
		return(node.next = new NodeTemp(data));
	}
		
	// Add child Node to a Node
	static public NodeTemp addChild(NodeTemp node,int data)
	{
		if(node == null)
			return null;
	
		// Check if child is not empty.
		if(node.child != null)
			return(addSibling(node.child,data));
		else
			return(node.child = new NodeTemp(data));
	}

	// Traverses tree in depth first order
	static public NodeTemp traverseTree(NodeTemp root,int parent)
	{
		if(root == null)
			return null;
		while(root != null)
		{
			System.out.print(root.data + " ");
			if(root.data==parent){
				return root;
			}
			if(root.child != null)
				return traverseTree(root.child,parent);
			root = root.next;
		}
		return root;
	}

	// Driver code
	public static void main(String args[])
	{
		
		/* Let us create below tree
		*		 10
		*	 / / \ \
		* 2 3	 4 5
		*			 | / | \
		*			 6 7 8 9 */
	
		// Left child right sibling
		/* 10
		* |
		* 2 -> 3 -> 4 -> 5
		*			 | |
		*			 6 7 -> 8 -> 9 */

		NodeTemp root = new NodeTemp(10);
		NodeTemp n1 = addChild(root,2);
		NodeTemp n2 = addChild(root,3);
		NodeTemp n3 = addChild(root,4);
		NodeTemp n4 = addChild(n3,6);
		NodeTemp n5 = addChild(root,5);
		NodeTemp n6 = addChild(n5,7);
		NodeTemp n7 = addChild(n5,8);
		NodeTemp n8 = addChild(n5,9);
		
		NodeTemp t = traverseTree(root,5);
		System.out.println();
		System.out.println(t.data+" >>>>>");
	}
}

// This code is contributed by M.V.S.Surya Teja.
