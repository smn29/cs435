import java.util.*
//consulted GeekforGeeks as references

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
		
		return newnode
	}
}


class iterativeAVLTree{
	int b;
	Node root;
	
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
			b = 0;
		}
		else if(n.right == null){
			n.height = n.left.height + 1;
			b = n.left.height;
			}
		else if(n.left == null){
			n.height = n.right.height + 1;
			b = n.right.height;
		}
		else{
			if(n.left.height > n.right.height){
				n.height = n.left.height + 1;
			b = n.left.height - n.right.height;
			}
			else{
				n.height = n.right.height + 1;
				b = n.right.height - n.left.height;
			}
		}
		//Right Right
		if(b < -1 && d > n.right.data){
			//left rotation
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
			//left rotation
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
				temp1.height = (temp1.left.height - temp1.right.height) + 1;
			}
			
		//Right Left
		else if(b < -1 $$ d < n.right.data){
			return RL(n);
			//right rotation
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
			//left rotation
			Node temp5 = n.left;
			Node temp6 = n.right;
			temp5.left = n;
			n.right = temp6;
			
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
			
			if(temp5.left == null && temp5.right == null){
				temp5.height = 0;
			}
			else if(temp5.left == null){
				temp5.height = temp5.right.height + 1;
			}
			else if(temp5.right == null){
				temp5.height = temp5.left.height + 1;
			}
			else if(temp5.left > temp5.right){
				temp5.height = (temp5.left.height - temp5.right.height) + 1;
			}
			else{
				temp5.height = (temp5.right.height - temp5.left.height) + 1;
			}
		}
		//Left Left
		else if(b > 1 && d < n.left.data){
			//right rotation
			Node t1 = n.left;
			Node t2 = n.right;
			t1.right = n;
			n.left = t2;
			
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
			
			if(t1.left == null && t1.right == null){
				t1.height = 0;
			}
			else if(t1.left == null){
				t1.height = t1.right.height + 1;
			}
			else if(t1.right == null){
				t1.height = t1.left.height + 1;
			}
			else if(t1.left > t1.right){
				t1.height = (t1.left.height - t1.right.height) + 1;
			}
			else{
				t1.height = (t1.right.height - t1.left.height) + 1;
			}
		}
		//Left Right
		else{
			//left rotation
			Node t3 = n.left;
			Node t4 = n.right;
			t4.left = n;
			n.right = t3;
			
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
			
			if(t3.left == null && t3.right == null){
				t3.height = 0;
			}
			else if(t3.left == null){
				t3.height = t3.right.height + 1;
			}
			else if(t3.right == null){
				t3.height = t3.left.height + 1;
			}
			else if(t3.left > t3.right){
				t3.height = (t3.left.height - t3.right.height) + 1;
			}
			else{
				t3.height = (t3.right.height - t3.left.height) + 1;
			}
			
			//right rotation
			Node t5 = n.left;
			Node t6 = n.right;
			t5.right = n;
			n.left = t6;
			
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
			
			if(t5.left == null && t5.right == null){
				t5.height = 0;
			}
			else if(t5.left == null){
				t5.height = t5.right.height + 1;
			}
			else if(t5.right == null){
				t5.height = t5.left.height + 1;
			}
			else if(t5.left > t5.right){
				t5.height = (t5.left.height - t5.right.height) + 1;
			}
			else{
				t5.height = (t5.right.height - t5.left.height) + 1;
			}
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
			b = 0;
		}
		else if(n.right == null){
			n.height = n.left.height + 1;
			b = n.left.height;
			}
		else if(n.left == null){
			n.height = n.right.height + 1;
			b = n.right.height;
		}
		else{
			if(n.left.height > n.right.height){
				n.height = n.left.height + 1;
			b = n.left.height - n.right.height;
			}
			else{
				n.height = n.right.height + 1;
				b = n.right.height - n.left.height;
			}
		}
		
		//Right Right
		if(b < -1 && d > n.right.data){
			//left rotation
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
			//left rotation
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
				temp1.height = (temp1.left.height - temp1.right.height) + 1;
			}
		//Right Left
		else if(b < -1 $$ d < n.right.data){
			return RL(n);
			//right rotation
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
			//left rotation
			Node temp5 = n.left;
			Node temp6 = n.right;
			temp5.left = n;
			n.right = temp6;
			
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
			
			if(temp5.left == null && temp5.right == null){
				temp5.height = 0;
			}
			else if(temp5.left == null){
				temp5.height = temp5.right.height + 1;
			}
			else if(temp5.right == null){
				temp5.height = temp5.left.height + 1;
			}
			else if(temp5.left > temp5.right){
				temp5.height = (temp5.left.height - temp5.right.height) + 1;
			}
			else{
				temp5.height = (temp5.right.height - temp5.left.height) + 1;
			}
		}
		//Left Left
		else if(b > 1 && d < n.left.data){
			//right rotation
			Node t1 = n.left;
			Node t2 = n.right;
			t1.right = n;
			n.left = t2;
			
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
			
			if(t1.left == null && t1.right == null){
				t1.height = 0;
			}
			else if(t1.left == null){
				t1.height = t1.right.height + 1;
			}
			else if(t1.right == null){
				t1.height = t1.left.height + 1;
			}
			else if(t1.left > t1.right){
				t1.height = (t1.left.height - t1.right.height) + 1;
			}
			else{
				t1.height = (t1.right.height - t1.left.height) + 1;
			}
		}
		//Left Right
		else{
			//left rotation
			Node t3 = n.left;
			Node t4 = n.right;
			t4.left = n;
			n.right = t3;
			
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
			
			if(t3.left == null && t3.right == null){
				t3.height = 0;
			}
			else if(t3.left == null){
				t3.height = t3.right.height + 1;
			}
			else if(t3.right == null){
				t3.height = t3.left.height + 1;
			}
			else if(t3.left > t3.right){
				t3.height = (t3.left.height - t3.right.height) + 1;
			}
			else{
				t3.height = (t3.right.height - t3.left.height) + 1;
			}
			
			//right rotation
			Node t5 = n.left;
			Node t6 = n.right;
			t5.right = n;
			n.left = t6;
			
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
			
			if(t5.left == null && t5.right == null){
				t5.height = 0;
			}
			else if(t5.left == null){
				t5.height = t5.right.height + 1;
			}
			else if(t5.right == null){
				t5.height = t5.left.height + 1;
			}
			else if(t5.left > t5.right){
				t5.height = (t5.left.height - t5.right.height) + 1;
			}
			else{
				t5.height = (t5.right.height - t5.left.height) + 1;
			}
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
