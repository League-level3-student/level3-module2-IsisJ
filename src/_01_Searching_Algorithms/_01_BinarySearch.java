package _01_Searching_Algorithms;

public class _01_BinarySearch {
	// Binary searches are good for sorted data because it
	// can potentially take a lot less time than a linear search,
	// especially if the data set is very large. But it cannot be used
	// for unsorted lists.
	
	// Because binary search is a recursive algorithm, the
	// binarySearch method will take in two extra integer parameters
	// to define the start and end position of the search.
	
	//1. Complete the steps in the binarySearch method.
	//   We can assume array is already sorted
	public static int binarySearch(int[] array, int start, int end, int value) {

		if(end >= start) {
			
		


			int mid = ((end - start)/2)+start;
			

			if(array[mid] == value) {
				return mid;
			}

            
			if(array[mid]>value) {
				return binarySearch(array, start, mid-1, value);
			}

			
			return binarySearch(array, mid+1, end, value);
			
		}
  
        return -1;
	} 
}
