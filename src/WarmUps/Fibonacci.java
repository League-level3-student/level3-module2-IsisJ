package WarmUps;

public class Fibonacci {
	public int fibonacci(int num) {
		if(num==1) {return 0;}
		if(num==2) {return 1;}
		int x = 0; 
		int y = 1;
		int result = 0;
		for(int i = 3; i<= num; i++) {
			 result = x + y;
			 x = y;
			 y = result;
		 }
		return result;
	}
	public static void main(String[] args) {
		Fibonacci fibber = new Fibonacci();
		System.out.println(fibber.fibonacci(50));
	}
}
