package com.gfg.test;

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
		return "NaryNode [id=" + id + ", parentId=" + parentId + ", label=" + label + ", child=" + child + "]";
	}
	
	

}
