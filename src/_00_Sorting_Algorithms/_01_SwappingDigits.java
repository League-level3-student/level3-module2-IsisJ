package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void testSwapArrayOfTwo() {
		int[] x = { 5, 6 };
		int[] y = { 6, 5 };
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);
	}
	
	@Test
	void testSortIntArray() {
		int[] z = { 7, 3, 5, 9, 2 };
		int[] q = { 2, 3, 5, 7, 9 };
		sortIntArray(z);
		assertArrayEquals(q, z);
	}
	
	@Test
	void testFindMiddleIndex() {
		int[] m = { 7, 3, 9, 5, 2 };
		assertEquals(5, findMiddle(m));
	}
	

	public static void swapArrayOfTwo(int[] arr) {
		int tempInt;
		tempInt = arr[0];
		arr[0] = arr[1];
		arr[1] = tempInt;

	}

	public static void swapIndex(int [] arr, int firstIndex, int secondIndex) {
		int tempInt;
		tempInt = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = tempInt;
		
	}

	public static void sortIntArray(int[] arr) {
		for(int a = 0; a <arr.length; a++) {
			for(int i =0; i < arr.length-1;i++) {
				if(arr[i] > arr[i+1]) {
					swapIndex(arr,i,i+1);
				}
			}
		}
	}

	public static int findMiddle(int[] arr) {
		sortIntArray(arr);
		int middleIndex = arr.length / 2;
		
		return arr[middleIndex];
	}
}
