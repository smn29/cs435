import java.util.*
import java.util.ArrayList
//consulted GeekforGeeks as reference

public class recursiveBST{
	Node root;
	//insertRec method
	public static Node insertRec(Node node, int n){
		Node rt = root;
		Node newnode = new_node(n);
		
		//If (empty root)
		if(rt == null){
			//Set root equal to the inserted node
			rt = newnode;
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
	public static Node deleteRec(Node node, int n){
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
			rt = rt.left;
		}

		//Else if (only right child)
		else if(rt.left ==null){
			//Copy right child as root
			rt = rt.right;
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

	public static Node findNextRec(Node n){
		int next = 0;
		int max = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		else{
			//While (left child exists)
			while(!(n.right == null)){
				//if no children
				if(n.right.right == null){
					max = next;
					//set max to value
					next = n.right.el;
				}
				else{
					next = n.right.el;
				}
				//recursviely call minimum
				findNextRec(n.right);
			}
		}
		return next;
	}

	public static Node findPrevRec(Node n){
		int prev = 0;
		int min = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		else{
			//While (left child exists)
			while(!(n.left == null)){
				//if no children
				if(n.left.left == null){
					//set min to value
					prev = min;
					min = n.left.el
					}
				else{
					prev = n.left.el;
					}
				//recursviely call minimum
				findPrevRec(n.left);
				}
			return prev;
		}
	}

	public static Node findMinRec(){
		int min = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}
		else{
			//While (left child exists)
			while(!(rt.left == null)){
				//if no children
				if(rt.left.left == null){
					//set min to value
					min = rt.left.el;
				}
				else{
					min = rt.left.el;
				}
				//recursviely call minimum
				findMinRec(rt.left);
			}
		}
		return min;
		}

	public static Node findMaxRec(Node root){
		int max = 0;
		Node rt = root;
		//If (empty tree)
		if(rt == null){
			//Return null
			return null;
		}

		else{
			//While (left child exists)
			while(!(rt.right == null)){
				//if no children
				if(rt.right.right == null){
					//set max to value
					max = rt.right.el;
				}
				else{
					max = rt.right.el;
				}
				//recursviely call minimum
				findMaxRec(rt.right);
			}
		}
		return max;
	}
	
	public static sort(ArrayList<Integer> lst){
		int size = lst.size();
		for(int i = 1; i < size; i++){
			int check = arr[i]; 
			int j = i - 1; 
			while(j > -1){
				while(arr[j] > check) { 
					arr[j + 1] = arr[j]; 
					j--; 
				}
			} 
			arr[j+1] = check; 
		}
		for(int x = 0; x < size; x++){
			System.out.print(lst[x] + ", ");
		}
	}
}
