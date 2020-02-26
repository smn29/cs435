import java.util.*
import java.util.ArrayList

public class sort(ArrayList<Integer> lst){

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
