package lesson;

public class SWITCH {

	public static void main(String[] args) {
		
		double a=3.0;
		double b=4.0;
		char operator='%';
		
		double res;
		
		switch(operator){
		case '+': res = a + b; break;
		case '-': res = a - b; break;
		case '*': res = a * b; break;
		case '/': res = a / b; break;
		case '%': res = a % b; break;
		default: res=Double.NaN;
		}
		System.out.print(res);

	}

}
