package _01_Searching_Algorithms;

public class _00_LinearSearch {
	
	public static int linearSearch(String[] words, String value) {
		
		for(int i = 0; i<words.length; i++) {
			if(words[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
	
}
