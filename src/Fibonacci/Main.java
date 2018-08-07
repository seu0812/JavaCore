package Fibonacci;

public class Main {

	public static void main(String[] args) {
		
		
		int res = f(33);
		System.out.println("res: "+res);

				
	}

	public static int f(int a){
	if(a == 1 || a == 2){
		return 1;
	} else if (a == 0){
		return 0;
	}else if(a<0) {
		throw new RuntimeException("a<0");
	}
	return f(a-1) + f(a-2);
	
	}
	
}
