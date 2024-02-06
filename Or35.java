import java.util.Scanner;

public class Or35{
	public static void main(String[] args){
		canDivideBy3or5();
			
	}
	public static boolean canDivideBy3or5(){
		Scanner sc = new Scanner(System.in);
		int input = -1;
			//vraag een postief getal aan de gebruiker
			do{
				System.out.print("Number: ");
				input = Integer.parseInt(sc.nextLine());
			}while(input <= 0);
			// kijk of die te vermenigvuldigen is met 3 of 5 zo ja return true anders false
			if(input % 3 == 0 || input % 5 == 0){
				return true;
			}else{
				return false;
			}
	}
}