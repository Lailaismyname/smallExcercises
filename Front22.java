class Front22{
	public static void main(String[] args){
		System.out.println(addLetters("Kitten"));
		System.out.println(addLetters("Tiny"));
		System.out.println(addLetters("Tina"));
	}
	
	public static String addLetters(String word){
		String firstTwoLetters = word.substring(0,2);
		return firstTwoLetters + word + firstTwoLetters;
	}
}