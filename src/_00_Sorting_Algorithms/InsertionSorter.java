package _00_Sorting_Algorithms;

public class InsertionSorter extends Sorter {
	public InsertionSorter() {
		type = "Insertion";
	}
	
	// Insertion Sort is similar to Bubble Sort but a little more efficient
	//  You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {		
		//1. make a for loop that starts at 1 and goes through 
		// the length of the array 
		for(int i = 1; i<array.length;i++) {
			for(int j = i; j>0; j--) {
				if(array[j] < array[j-1]) {
					_01_SwappingDigits.swapIndex(array, j-1, j);
					display.updateDisplay();
				}
			}
		}
			//2. make another for loop that starts at i and counts down
        	//   while j is greater than 0

				//3. if the element at j is less than the element at j - 1,
            	//   then swap them
	}
}
