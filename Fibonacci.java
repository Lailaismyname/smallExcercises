import java.util.Scanner;

public class Fibonacci{
	private static long[] savedFibNrs;
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Number: ");
		int input = Integer.parseInt(sc.nextLine());
		savedFibNrs = new long[input + 1];
		System.out.println("method 1: " + fibonacci(input));
		
		System.out.println("method 2: " + fibonacciWithWhileLoop(input));
		
		System.out.println("method 3: " + fibonacciWithForLoop(input));
	}
	
	public static long fibonacci(int n){
		if (n <= 1){
			return n;
		}
		if (savedFibNrs[n] != 0){
			return savedFibNrs[n];
		}
		long fibNr = (fibonacci(n - 1) + fibonacci(n - 2));
		savedFibNrs[n] = fibNr;
		return fibNr;
	}
	
	
	// fibbonaci met while loop
	public static long fibonacciWithWhileLoop(int input){
		int iteration = 2;
		long nr = 1;
		long prevNr =  1;
		long temp = 0;
		while (iteration != input){
			temp = nr;
			nr = nr + prevNr;
			prevNr = temp;
			iteration++;
		}
		return nr;
	}
	
	
	// met for loop
	public static long fibonacciWithForLoop(int input){
		long nr = 1;
		long prevNr =  1;
		long temp = 0;
		for(int i = 2; i < input; i++){
			temp = nr;
			nr = nr + prevNr;
			prevNr = temp;
		}
		return nr;
	}
}