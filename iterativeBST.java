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

public class iterativeBST{
	Node root;
	//insertIter method
	static Node insertIter(Node root, int n){
		Node rt = root;
		Node newnode = new_node(n);
		
		//If (empty root)
		if(rt == null){
			//Set root equal to the inserted node
			rt = newnode;
		}

		//else if no left child
		else if(rt.left == null){
			//make left child the new node
			rt.left = newnode;
		}

		//else if no right child
		else if(rt.right == null){
			//make the right child the new node
			rt.right = newnode;
		}

		//else
		else{
			//while it's not null
			while(! (rt == null)){
				//if n is less than root
				if(n.el < rt.el){
					if(rt.left != null){
						//change node to be left child
						rt.left = newnode.el;
					}

					else{
						//change root to new node to look at
						rt = rt.left;
					}
				}

				else{
					if(rt.right != null){
						//change node to be right child
						rt.right = newnode.el;
					}

					else{
						//change root to new node to look at
						rt = rt.right;
					}
				}
			}
		}
	}

	//deleteIter method
	static Node deleteIter(Node root, int n){
		Node rt = root;

		while(!(rt == null)){
			if(n < rt.el){
				if(rt.left != null){
					//change node to be left child
					rt = rt.left;
				}

				else{
					//change root to new node to look at
					rt = newnode;
				}
			}

			else{
				if(rt.right != null){
					//change node to be right child
					rt = rt.right;
				}

				else{
					//change root to new node to look at
					rt = newnode;
				}
			}
		}

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
			rt = rt.left;
		}

		//Else
		else{
			//Copy right child as root
			rt = rt.right;
		}

	}

	//findNextIter method
	static Node findNextIter(Node n){
		int next = 0;
		int max = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		//Else if (no children)
		else if(rt.left == null && rt.right == null){
			//Return root
			return rt.el;
		}

		//Else
		else{
			//While (right child exists)
			while(!(n.right == null)){
				//Set next equal to maximum
				max = next;
				//Set maximum equal to right child
				next = n.right.el;
				n = n.right;
			}
		//Return next
		return next;
		}
	}

	//findPrevIter method
	static Node findPrevIter(Node n){
		int prev = 0;
		int min = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		//Else if (no children)
		else if(rt.left == null && rt.right == null){
			//Return root
			return rt.el;
		}

		//Else
		else{
			//While (left child exists)
			while(!(n.left == null)){
				//Set next equal to minimum 
				prev = min;
				//Set minimum equal to right child
				min = n.left.el;
				n = n.left;
			}
		//Return prev
		return prev;
		}
	}

	//findMinIter method
	static Node findMinIter(){
		int min = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}
		//Else if (no children)
		else if(rt.left == null && rt.right == null){
			//Return root
			min = rt.el;
			return min;
		}
		//Else
		else{
			//While (left child exists)
			while(!(rt.left == null)){
				//Set minimum equal to right child
				min = rt.left.el;
				rt = rt.left;
			}
		//Return min
		return min;
		}
	}

	//findMaxIter method
	static Node findMaxIter(){
		int max = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		//Else if (no children)
		else if(rt.left == null && rt.right == null){
			//Return root
			max = rt.el;
			return max;
		}

		//Else
		else{
			//While (right child exists)
			while(!(rt.right == null)){
				//Set maximum equal to right child
				max = rt.right.el;
				rt = rt.right;
			}
			//Return next
			return next;
		}
	}

}

/*5. Okay, so something you should probably know, findPrev is supposed to call findMin in order to do its job. 
Read the code in findMin and read findPrev, notice anything similar? */

/*6. findNextIter is supposed to use findMaxIter to do its job. Read the code in findMax and findNextIter? Notice anything similar? 

/*7. You write a lot of redundant code, and its an impressive show of fortitude, just remember. . . 
If What you can do in 200 lines you can do in 50? Choose 50!*/
