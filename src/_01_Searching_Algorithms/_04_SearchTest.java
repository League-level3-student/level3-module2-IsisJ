package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		
		String[] words = {"Hey", "Hi", "Hello"};
		
		assertEquals(2, _00_LinearSearch.linearSearch(words, "Hello"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "Hey"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "Howdy"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] numbers = {22, 25, 30, 40, 45};
		
		assertEquals(2, _01_BinarySearch.binarySearch(numbers, 0, 4, 30));
		assertEquals(0, _01_BinarySearch.binarySearch(numbers, 0, 4, 22));
		assertEquals(-1, _01_BinarySearch.binarySearch(numbers, 0, 4, 32));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] numbers = {22, 25, 30, 40, 45};
		
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(numbers, 30));
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(numbers, 22));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(numbers, 27));
		
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] numbers = {1,2,3,4,45,67,74,89,98,123,234,345,456};
		
		assertEquals(7, _03_ExponentialSearch.exponentialSearch(numbers,89));
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(numbers,3));
		assertEquals(10, _03_ExponentialSearch.exponentialSearch(numbers,234));
		
	}
}
