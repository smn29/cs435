import java.util.*;
//consulted GeekforGeeks as references

class iterativeAVLTree{
	int bal;
	Node root;
	//left rotation helper method
	static Node leftRotationHelper(Node n){
		Node temp1 = n.left;
		Node temp2 = n.right;
		temp2.left = n;
		n.right = temp1;

		if(n.left == null && n.right == null){
			n.height = 0;
		}
		else if(n.left == null){
			n.height = n.right.height + 1;
		}
		else if(n.right == null){
			n.height = n.left.height + 1;
		}
		else if(n.left > n.right){
			n.height = (n.left.height - n.right.height) + 1;
		}
		else{
			n.height = (n.left.height - n.right.height) + 1;
		}

		if(temp1.left == null && temp1.right == null){
			temp1.height = 0;
		}
		else if(temp1.left == null){
			temp1.height = temp1.right.height + 1;
		}
		else if(temp1.right == null){
			temp1.height = temp1.left.height + 1;
		}
		else if(temp1.left > temp1.right){
			temp1.height = (temp1.left.height - temp1.right.height) + 1;
		}
		else{
			temp1.height = (temp1.right.height - temp1.left.height) + 1;
		}
	}
	//right rotation helper method
	static Node rightRotationHelper(Node n){
		Node temp3 = n.left;
		Node temp4 = n.right;
		temp3.right = n;
		n.left = temp4;

		if(n.left == null && n.right == null){
			n.height = 0;
		}
		else if(n.left == null){
			n.height = n.right.height + 1;
		}
		else if(n.right == null){
			n.height = n.left.height + 1;
		}
		else if(n.left > n.right){
			n.height = (n.left.height - n.right.height) + 1;
		}
		else{
			n.height = (n.left.height - n.right.height) + 1;
		}

		if(temp3.left == null && temp3.right == null){
			t1.height = 0;
		}
		else if(temp3.left == null){
			temp3.height = temp3.right.height + 1;
		}
		else if(temp3.right == null){
			temp3.height = temp3.left.height + 1;
		}
		else if(temp3.left > temp3.right){
			temp3.height = (temp3.left.height - temp3.right.height) + 1;
		}
		else{
			temp3.height = (temp3.right.height - temp3.left.height) + 1;
		}
	}
	
	static Node insertIter(Node n, int d){
		if(n == null){
			n = new_node(d);
		}

		if(d < n.data){
			//while root isn't null
			while(!(root == null)){
				//if the value in the node is less than the value in the root
				//and the root's left child is null
				if(n.data < root.data && rt.left == null){
					//change node to be left child
					root.left = n.data;
				}
				else{
					//change root to new node to look at
					root = root.left;
				}
			}
		}

		else{
			//while root isn't null
			while(!(root == null)){
				//if the value in the node is greater than the value in the root
				//and the root's right child is null
				if(n.data > root.data && rt.right == null){
					//change node to be left child
					root.left = n.data;
				}
				else{
					//change root to new node to look at
					root = root.right;
				}
			}
		}

		if(n.left == null and n.right == null){
			n.height = 0;
			bal = 0;
		}
		else if(n.right == null){
			n.height = n.left.height + 1;
			bal = n.left.height;
			}
		else if(n.left == null){
			n.height = n.right.height + 1;
			bal = n.right.height;
		}
		else{
			if(n.left.height > n.right.height){
				n.height = n.left.height + 1;
			bal = n.left.height - n.right.height;
			}
			else{
				n.height = n.right.height + 1;
				bal = n.right.height - n.left.height;
			}
		}
		//Right Right
		if(bal < -1 && d > n.right.data){
			//left rotation
			leftRotationHelper(n);
		}
			
		//Right Left
		else if(bal < -1 $$ d < n.right.data){
			//right rotation
			rightRotationHelper(n);
			//left rotation
			leftRotationHelper(n);
		}
		//Left Left
		else if(bal > 1 && d < n.left.data){
			//right rotation
			rightRotationHelper(n);
		}
		//Left Right
		else{
			//left rotation
			leftRotationHelper(n);
			//right rotation
			rightRotationHelper(n);
		}
	}
	
	static Node deleteIter(Node x, int y){
		Node rt = root;
		Node newnode = new_node(x);
		while(rt != null){
			if(y < rt.data){
				if(rt.left != null){
					rt = rt.left;
				}
				else{
					rt = newnode;
				}
			}
			else{
				if(rt.right!=null){
					rt = rt.right;
				}
				else{
					rt = newnode;
				}
			}
		}
		if(rt == null){
			return null;
		}
		else if(rt.left == null && rt.right == null){
			rt.el = null;
		}
		else if(rt.right == null){
			rt = rt.left;
		}
		else{
			rt = rt.right;
		}
		
		if(n.left == null and n.right == null){
			n.height = 0;
			bal = 0;
		}
		else if(n.right == null){
			n.height = n.left.height + 1;
			bal = n.left.height;
			}
		else if(n.left == null){
			n.height = n.right.height + 1;
			bal = n.right.height;
		}
		else{
			if(n.left.height > n.right.height){
				n.height = n.left.height + 1;
			bal = n.left.height - n.right.height;
			}
			else{
				n.height = n.right.height + 1;
				bal = n.right.height - n.left.height;
			}
		}
		//Right Right
		if(bal < -1 && d > n.right.data){
			//left rotation
			leftRotationHelper(n);
		}
			
		//Right Left
		else if(bal < -1 $$ d < n.right.data){
			//right rotation
			rightRotationHelper(n);
			//left rotation
			leftRotationHelper(n);
		}
		//Left Left
		else if(bal > 1 && d < n.left.data){
			//right rotation
			rightRotationHelper(n);
		}
		//Left Right
		else{
			//left rotation
			leftRotationHelper(n);
			//right rotation
			rightRotationHelper(n);
		}
	}
	
	static Node findNextIter(Node n){
		int next = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		//Else if (no children)
		else if(rt.left == null && rt.right == null){
			//Return root
			return rt.data;
		}

		//Else
		else{
			//While (right child exists)
			if(n.right != null){
				next = n.right.data;
				}
			}
		//Return next
		return next;
		}
	}
	
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
			return rt.data;
		}

		//Else
		else{
			//While (left child exists)
			if(n.left != null){
				//Set next equal to minimum 
				prev = n.left.data;
				}
			}
		//Return prev
		return prev;
		}
	}

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
			min = rt.data;
			return min;
		}
		//Else
		else{
			//While (left child exists)
			while(!(rt.left == null)){
				//Set minimum equal to right child
				min = rt.left.data;
				rt = rt.left;
			}
		//Return min
		return min;
		}
	}

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
			max = rt.data;
			return max;
		}

		//Else
		else{
			//While (right child exists)
			while(!(rt.right == null)){
				//Set maximum equal to right child
				max = rt.right.data;
				rt = rt.right;
			}
			//Return next
			return next;
		}
	}
}
