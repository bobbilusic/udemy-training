package Section5;

public class Demo {

	public static void main(String[] args) {
		// int a = 5;
		// int b = 0;
		// int c = a/b;
		// System.out.println(c);
		
		System.out.println("Program starts");
		doMath(12,0);
		System.out.println("Program continues");
	}
	
	public static void doMath(int a, int b) {
		// int c = a/b;
		// System.out.println(c);
		
		answer(a,b);
	}
	
	public static double answer(int x, int y) {
		// Catch error HERE
		return x/y;
		
	}

}

