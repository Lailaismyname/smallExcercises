class EvenSumOfDigits{
	public static void main(String[] args){
		evenSumOfDigits();
	}
	public static void evenSumOfDigits(){
		for(int i = 100; i < 150; i++){
			char[] numbers = Integer.toString(i).toCharArray();
			
			for(int nr: numbers){
				System.out.println((int)nr);
			}
		}
	}
}