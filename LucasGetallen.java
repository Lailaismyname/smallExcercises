import java.util.Scanner;
public class LucasGetallen{
	int numberA = 2;
	int numberB = 1;
	int requestedAmountOfNumbers = 0;
	Scanner sc = new Scanner(System.in);
	
	public void mainMethod(){
		requestedAmountOfNumbers = getNumber();
		printNumbers();
	}
	
	public int getNumber(){
		int number = -1;
		do{
			System.out.print("Number: ");
			number = Integer.parseInt(sc.nextLine());
			if(number < 1){
				System.out.println("Getal fout, negatief.");
			}else if(number > 22){
				System.out.println("Getal te groot, past niet");
			}
		}while(number < 1 || number > 22);
		return number;
		}
		
		// 2 1 3 4 7 11 18
		public void printNumbers(){
			for(int i = 0; i < requestedAmountOfNumbers; i++){
				System.out.print(numberA + " " + numberB + " ");
				numberA = numberA + numberB;
				numberB = numberA + numberB;
			}
		}
}