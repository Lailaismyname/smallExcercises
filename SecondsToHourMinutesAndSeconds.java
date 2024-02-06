import java.util.Scanner;

public class SecondsToHourMinutesAndSeconds{
	public static void main(String[] args){
		System.out.println(calculate());
	}
	public static String calculate(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Seconds: ");
		int userInput = Integer.parseInt(sc.nextLine());
		
		int minutes = userInput / 60 ; 
		userInput =  userInput - (minutes * 60);
		
		int hours = minutes / 60;
		minutes = minutes - (hours * 60);
		
		int seconds = userInput;
				
		String output = hours + ":" + minutes + ":" + seconds;
		return output;
	}
}