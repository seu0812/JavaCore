package Polindrome;


public class Main {

	public static void main(String[] args) {
	
	boolean b = isPolindrome("sadffdas");
	System.out.println(b);

	}
	
	public static boolean isPolindrome (String str){
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.reverse();
		return stringBuilder.toString().equals(str);
	}

}
