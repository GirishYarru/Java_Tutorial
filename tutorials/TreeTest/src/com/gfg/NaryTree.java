package com.gfg;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;

public class NaryTree {
	
	private NaryNode root;
	
	public NaryTree() {
		this.root = null;
	}
	
	
	public  NaryNode insert(NaryNode rootNode,int parent, NaryNode node) {
		
		if (root == null) {
			root = node;
		} else {
			if (rootNode.id == parent) {
				rootNode.child.add(node);
			} else {
				for (int i = 0; i < rootNode.child.size(); i++) {
					insert(rootNode.child.get(i), parent, node);
				}
			}
		}
		return root;
	}
	
	public void convertIntoJson() {
		
	}
	
	public static void main(String[] args) throws Exception{
		NaryNode root = new NaryNode(1, "root" , -1);
		NaryTree tree = new NaryTree();
		tree.insert(tree.root, 0, root);
		
		//adding child
		NaryNode child1 = new NaryNode(2, "bear", 1);
		tree.insert(tree.root, child1.parentId, child1);
		
		//adding child
		NaryNode child2 = new NaryNode(3, "pig", 1);
		tree.insert(tree.root, child2.parentId, child2);
		
//		//adding child
//		NaryNode child3 = new NaryNode(4, "pig_child", 3);
//		tree.insert(tree.root, child3.parentId, child3);
//		
//		//adding child
//		NaryNode child4 = new NaryNode(5, "pig_child", 4);
//		tree.insert(tree.root, child4.parentId, child4);
		
		
		//System.out.println(root);
		
//		JSONArray arr = new JSONArray();
//		JSONObject obj = new JSONObject();
//		arr.put(0, root);
//		 Gson gson = new Gson();
//        String json = gson.toJson(arr, new TypeToken<JSONArray>() {}.getType());
//        System.out.println(json);
		
		//System.out.println(arr);
        
JSONArray ar = new JSONArray();
JSONObject obj = new JSONObject();
obj.put(""+root.id,""+root);

ar.put(obj);
System.out.println(root);



		
		
		
		
	}

}
