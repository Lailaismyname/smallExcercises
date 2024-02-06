class NotString{
	public static void main(String[] args){
		System.out.println(notString("candy"));
		System.out.println(notString("x"));
		System.out.println(notString("not bad"));
		System.out.println(notString("Tiny tina"));
	}
	public static String notString(String text){
		if(text.length() < 2){
			return "not " + text;
		} else if (text.substring(0,3).equalsIgnoreCase("not")){
			return text;
		}else {
			return "not " + text;
		}
	}
}