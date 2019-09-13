package _01_Searching_Algorithms;

public class _01_BinarySearch {

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
