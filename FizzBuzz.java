public class FizzBuzz{
	public static void main(String[] args){
		for(int i = 1; i <= 100; i++){
			
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0){
				System.out.println("Fizz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
}

/*
The problem: make a program that prints out the numbers from 1 to 100. HOWEVER, 
instead of printing just 1, 2, 3, .. 100
every number that is divisible by three should be replaced by Fizz, every 
number that is divisible by 5 by Buzz,
and every number that is divisible by 3 and 5 should be replaced by FizzBuzz
*/