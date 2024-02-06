import java.util.Scanner;

public class LastDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int value1 = -1;
		int value2 = -1;
		
		// pak 2 positieve waardes
		do{
			System.out.print("value 1:");
			value1 = Integer.parseInt(sc.nextLine());
		}while(value1 <= 0);
		do{
			System.out.print("value 2:");
			value2 = Integer.parseInt(sc.nextLine());
		}while(value2 <= 0);
		// return true als ze dezelfde laatste nummer hebben
		if(value1 % 10 == value2 % 10){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
}