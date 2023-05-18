package com.gfg;

import java.util.ArrayList;
import java.util.List;

public class NaryNode {
	int id;
	int parentId;
	String label;
	NaryNode root;
	ArrayList<NaryNode> child;

	public NaryNode(int id, String label, int parentId) {
		super();
		this.id = id;
		this.label = label;
		this.parentId = parentId;
		this.child = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "[{\"" + id + "\":{\"label\":" + "\""+label+"\"" + ", \"children\" :" + child + "}}]";
	}
	
	

}
