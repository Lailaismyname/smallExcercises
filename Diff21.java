class Diff21{
	public static void main(String[] args){
		System.out.println(diff21(2));
		System.out.println(diff21(11));
		System.out.println(diff21(0));
		System.out.println(diff21(22));
	}
	
	public static int diff21(int n){
		return n < 21 ? 21 - n : (n - 21) * 2;
	}
}