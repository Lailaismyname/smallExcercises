class EvenOrOdd{
	public static void main(String[] args){
		System.out.println(isEvenOrOdd(0));
		System.out.println(isEvenOrOdd(1));
		System.out.println(isEvenOrOdd(2));
		System.out.println("Barz");
	}
	public static int isEvenOrOdd(int n){
		if(n == 0){
			return 1;
		}else if(n % 2 == 0){
			return 1;
		} else {
			return 0;
		}
	}
}