package _01_Searching_Algorithms;

public class _03_ExponentialSearch {
	
	public static int exponentialSearch(int array[], int value){

		if(array[0]==value) {
			return 0;
		}
		
		while(counter<array.length && array[counter]<=value) {
			//5. inside the while loop, double the value of counter.
			counter = counter*2;
		}	
		
		int minimum;
		
		if(counter<array.length) {
			minimum = counter;
		}
		
		else { 
			minimum = array.length-1;
		}
		
		return _01_BinarySearch.binarySearch(array, counter/2, minimum, value);
	}
}
