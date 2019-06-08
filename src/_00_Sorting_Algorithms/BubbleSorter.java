package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {

		for(int i = 0; i< array.length-1; i++) {
			int currentNum = array[i];
			int comparedNum = array[i+1];
			if(currentNum>comparedNum) {
				swapIndex(array, i, i+1);
				display.updateDisplay();
			}
		}
	}

	public static void swapIndex(int [] arr, int firstIndex, int secondIndex) {
		int tempInt;
		tempInt = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = tempInt;
		
	}
	
}
