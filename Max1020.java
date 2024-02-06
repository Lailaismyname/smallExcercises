class Max1020{
	public static void main(String[] args){
		System.out.println(getTopOfRange(11,19));
		System.out.println(getTopOfRange(19,11));
		System.out.println(getTopOfRange(11,9));
		System.out.println(getTopOfRange(1,900));
		System.out.println(getTopOfRange(10000,9));
	}
	public static int getTopOfRange(int number1, int number2){
		int difference = number1 - number2;
		
		
		if(difference > 10 || difference < -10){
			return 0;
		} else if(number1 < number2){
			return number2;
		} else{
			return number1;
		}
	} 
}