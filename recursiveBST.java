import java.util.*
//consulted GeekforGeeks as references
// I wrote out the node class and methods because I wasn't sure if I had to include them or not
class Node{
	//node method
	static class Node {
		int el;
		Node right;
		Node left;
	}
	
	//making a new node method
	static class new_node(int val){
		int newnode = new Node();
		
		newnode.el = val;
		newnode.right = null;
		newnode.left = null;
		
		return newnode
	}
}

public class recursiveBST{
	//insertRec method
	static Node insertRec(Node root, int n){
		Node rt = root;
		Node newnode = new_node(n);
		
		//If (empty root)
		if(rt == null){
			//Set root equal to the inserted node
			rt = new_node(n);
		}
		
		//Else
		else{
			//If smaller than root
			if (n < rt.el){
				//Recursively call insert with node and left subtree
				rt.left = insertRec(rt.left, n);
			}
			//Else
			else{
				//Recursively call insert with node and right subtree
				rt.right = insertRec(rt.right, n);
			}
		}
	}

	//deleteRec method
	static Node deleteRec(Node root, int n){
		Node rt = root;
		//if(empty tree)
		if (rt == null){
			//return null
			return null;
		}
		
		//if (no children)
		else if(rt.left == null && rt.right == null){
			//Set root to null
			rt.el = null;
		}

		//Else if (only left child)
		else if(rt.right == null){
			//Copy left child as root
			rt.el = rt.left.el;
		}

		//Else if (only right child)
		else if(rt.left ==null){
			//Copy right child as root
			rt.el = rt.right.el;
		}

		//Else
		else{
			//If smaller than root
			if(n < rt.el){
				//Recursively call delete with node and left subtree
				rt.left = deleteRec(rt.left, n);
			}
			//Else
			else{
				//Recursively call delete with node and right subtree
				rt.right = deleteRec(rt.right, n);
			}
		}
	}

	//findNextRec method
	static Node findNextRec(Node root){
		int next = 0;
		int max = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		//Else
		else{
			//While (left child exists)
			while(!(rt.right == null)){
				//if no children
				if(rt.right.right == null){
					max = next;
					//set max to value
					next = rt.left.el;
					//return max
					return next;
				}
				//recursviely call minimum
				findNextRec(rt.right);
			}
		}

	}

	//findPrevRec method
	static Node findPrevRec(Node root){
		int prev = 0;
		int min = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		//Else
		else{
			//While (left child exists)
			while(!(rt.left == null)){
				//if no children
				if(rt.left.left == null){
					//set min to value
					prev = min;
					min = rt.left.el
					//return min
					return prev;
				}
				//recursviely call minimum
				findPrevRec(rt.left);
			}
		}

	}

	//findMinRec method
	static Node findMinRec(Node root){
		int min = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		//Else
		else{
			//While (left child exists)
			while(!(rt.left == null)){
				//if no children
				if(rt.left.left == null){
					//set min to value
					min = rt.left.el;
					//return min
					return min;
				}
				//recursviely call minimum
				findMinRec(rt.left);
			}
		}

	}

	//findMaxRec method
	static Node findMaxRec(Node root){
		int max = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		//Else
		else{
			//While (left child exists)
			while(!(rt.right == null)){
				//if no children
				if(rt.right.right == null){
					//set max to value
					max = rt.left.el;
					//return max
					return max;
				}
				//recursviely call minimum
				findMaxRec(rt.right);
			}
		}

	}

}
