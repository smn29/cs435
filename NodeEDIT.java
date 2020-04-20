import java.util.*;

class Node{
	//node method
	static class Node {
		int data;
		int height;
		Node right;
		Node left;
	}
	
	//making a new node method
	static class new_node(int val){
		int newnode = new Node();
		
		newnode.data = val;
		newnode.right = null;
		newnode.left = null;
		newnode.height = 0;
		
		return newnode;
	}
}
