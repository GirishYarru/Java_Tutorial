package com.gfg;
import java.util.ArrayList;
import java.util.List;

class Node {
	int val;
	List<Node> child;

	public Node(int data) {
		val = data;
		child = new ArrayList<>();
	}
}

class Tree {
	static Node insert(Node root, int parent, Node node) {
		if (root == null) {
			root = node;
		} else {
			if (root.val == parent) {
				root.child.add(node);
			} else {
				for (int i = 0; i < root.child.size(); i++) {
					insert(root.child.get(i), parent, node);
				}
			}
		}
		return root;
	}

	static void levelorderRoot(Node root) {
		if (root != null) {
			List<Node> level = new ArrayList<>();
			level.add(root);
			System.out.println(root.val);
			levelorder(level);
		}
	}

	static void levelorder(List<Node> prevLevel) {
		List<Node> curLevel = new ArrayList<>();
		List<Integer> printData = new ArrayList<>();
		for (int i = 0; i < prevLevel.size(); i++) {
			for (int j = 0; j < prevLevel.get(i).child.size(); j++) {
				curLevel.add(prevLevel.get(i).child.get(j));
				printData.add(prevLevel.get(i).child.get(j).val);
			}
		}
		prevLevel = curLevel;
		for (int i : printData) {
			System.out.print(i + " ");
		}
		System.out.println();
		if (prevLevel.size() > 0) {
			levelorder(prevLevel);
		}
	}

	public static void main(String[] args) {
		int[] arr = {-1, -1, -1, -1, -1};
		Node root = new Node(-1);
		List<Integer> que = new ArrayList<>();
		que.add(-1);
		while (true) {
			List<Integer> temp = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				if (que.contains(arr[i])) {
					root = insert(root, arr[i], new Node(i));
					temp.add(i);
				}
			}
			que = temp;
			if (que.size() == 0) {
				break;
			}
		}
		levelorderRoot(root);
	}
}

// This code is contributed by aadityaburujwale.
