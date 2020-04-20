import java.util.*;
import java.lang.Math;

public class array{
//(a) (2 points) (You must submit code for this question!) Implement a function getRandomArray(n) where the output is an array of size n, and contains distinct random numbers 
//(in other words, no two numbers in the array should be the same number). Math.rand() might be useful here. 
	public int getRandomArray(int n){
		int[] arr = new int[n];
		boolean check = true;
		int ctr = 0;

		while(ctr <= n ){
			int val = (int)Math.random();
			for(int i = 0; i <= ctr; i++){
				if(val == arr[i]){
					check = false;
				}
			}
			if(check){
				arr[ctr] = val;
				ctr++;
			}
		}

		for(int x = 0; x <= n; x++){
			System.out.println(arr[x] + ", ");
		}
	}
//(b) (3 points) (You must submit code for this question!) Implement a function getSortedArray(n) where the output is an array of size n. 
//The 0th element should be equal to n, the 1st element should be equal to n-1, and so on.

  public int getSortedArray(int n){
    int[] arr = int[n];
    int element = n;
    for(int i = 0; i <= n; i++){
    arr[i] = element;
    element --;
		}

		for(int x = 0; x <= n; x++){
			System.out.println(arr[x] + ", ");
		}
	}

}
