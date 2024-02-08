class ReverseAnInteger{
	public static void main(String[] arr){
		System.out.println(reverseAnInteger(1234)); // output moet 4321 zijn
	}
	public static int reverseAnInteger(int number){
		String newNr = "";
		char[] digits = String.valueOf(number).toCharArray();
		for(char nr: digits){
			newNr = nr + newNr;
		}
		
		return Integer.parseInt(newNr);
	}
}