class SleepIn{
	public static void main(String[] arr){
		System.out.println(sleepIn(false,false));
		System.out.println(sleepIn(true,false));
		System.out.println(sleepIn(false,true));
		
	}
	public static boolean sleepIn(boolean weekday, boolean vacation){
		if(!weekday && !vacation){
			return true;
		} else if(weekday && !vacation){
			return false;
		} else{
			return true;
		}
	}
}