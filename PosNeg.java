class PosNeg{
	public static void main(String[] arg){
		System.out.println(posNeg(1,-1, false));
		System.out.println(posNeg(-1,1,false));
		System.out.println(posNeg(-5,-5,true));
		System.out.println(posNeg(0,0,true));
	}
	public static boolean posNeg(int value1, int value2, boolean negative){
		if(negative){
			return value1 < 0 && value2 < 0;
		}else{
			return value1 < 0 && value2 > 0 || value2 < 0 && value1 > 0;
		}
	}
}