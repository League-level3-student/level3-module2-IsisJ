package _00_Sorting_Algorithms;


public class _00_SortedArrayChecker {

	public static boolean intArraySorted(int[] unsorted) {
		for(int i = 0; i<unsorted.length-1; i++) {
			int currentNum = unsorted[i];
			int comparedNum = unsorted[i+1];
			if(currentNum > comparedNum) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean doubleArraySorted(double[] unsorted) {
		for(int i = 0; i<unsorted.length-1; i++) {
			double currentNum = unsorted[i];
			double comparedNum = unsorted[i+1];
			if(currentNum > comparedNum) {
				return false;
			}
		}
		return true;	
		}

	public static boolean charArraySorted(char[] unsorted) {
		for(int i =0; i<unsorted.length-1;i++) {
			char currentChar = unsorted[i];
			char comparedChar = unsorted[i+1];
			if(currentChar > comparedChar) {
				return false;
			}
		}
		return true;
	}

	public static boolean stringArraySorted(String[] unsorted) {
		for(int i = 0; i<unsorted.length-1;i++) {
			String currentString = unsorted[i];
			String comparedString = unsorted[i+1];
			if(currentString.compareTo(comparedString) > 0) {
				return false;
			}
		}
		return true;
	}

}
