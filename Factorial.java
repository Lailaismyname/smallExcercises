import java.util.Scanner;

class Factorial{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("enter a positive number: ");
		int input = Integer.parseInt(sc.nextLine());
		System.out.println(factorial(input));
	}
	
	public static long factorial(int input){
		long factorial = input;
		long temp = input;
		do {
			factorial = factorial * (temp - 1);
			temp--;
		}while (temp != 1);
		return factorial;
	}
	
}