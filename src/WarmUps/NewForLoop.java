package WarmUps;

import java.util.ArrayList;

public class NewForLoop {

	public static void main(String[] args) {
		
		ArrayList<Integer> scores = new ArrayList<>(3);
		scores.add(7);
		scores.add(9);
		scores.add(-18);
		
		for(Integer score : scores) {
			System.out.println(score);
		}
		
		ArrayList<String> words = new ArrayList<>(3);
		words.add("Esme");
		words.add("John");
		words.add("David");
		
		for(String word : words) {
			System.out.println(word);
		}
		
		
	}
	
	
}
