package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _00_SortedArrayCheckerTest {

	@Test
	void testIntArray() {
		int[] unsorted = {3, 2, 9, 3, 1, 0};
		int[] sorted = {0, 1, 2, 2, 3, 4};
		
		assertFalse(_00_SortedArrayChecker.intArraySorted(unsorted));
		assertTrue(_00_SortedArrayChecker.intArraySorted(sorted));
	}
	
	@Test
	void testDoubleArray() {
		double[] unsorted = {3, 2, 9, 3, 1, 0};
		double[] sorted = {0, 1, 2, 2, 3, 4};
		
		assertFalse(_00_SortedArrayChecker.doubleArraySorted(unsorted));
		assertTrue(_00_SortedArrayChecker.doubleArraySorted(sorted));
	}
	
	@Test
	void charDoubleArray() {
		char[] unsorted = {'c', 'F', 'p', 'A'};
		char[] sorted = {'a', 'b', 'c', 'd', 'e'};
		
		assertFalse(_00_SortedArrayChecker.charArraySorted(unsorted));
		assertTrue(_00_SortedArrayChecker.charArraySorted(sorted));
	}
	
	@Test
	void stringDoubleArray() {
		String[] unsorted = {"carrot", "pineapple", "mango", "pear"};
		String[] sorted = {"apple", "banana", "carrot", "grape"};
		
		assertFalse(_00_SortedArrayChecker.stringArraySorted(unsorted));
		assertTrue(_00_SortedArrayChecker.stringArraySorted(sorted));
	}

}
