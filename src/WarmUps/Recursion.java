package WarmUps;

public class Recursion {

	public static void main(String[] args) {
		Recursion recursion = new Recursion();
		System.out.println(recursion.reverseString("abcd"));
	}
	
	public String reverseString( String toReverse) {
		if(toReverse.length()==1) {
			return toReverse;
		}
		String first = toReverse.substring(0,1);
		String last = toReverse.substring(1);
		return reverseString(last) +first;
	}
	
}
