package exemple;

public class Main {
	
	public static void main(String[] args) {
	
	Complex complex = new Complex();
	complex.setReal(34.12);
	complex.setIm(12.67);
	
	Complex complex2 = new Complex(12.67, 16.89);
	
	Complex result = complex.plus(complex2);
	
	System.out.println(result.toString());
	

	Rectangle rectangle = new Rectangle(15, 24);
	
	double square = rectangle.square();
	
	System.out.println("Square = "+ square);
	
	double perimetr = rectangle.perimetr();
	
	System.out.println("perimetr = "+perimetr);
	
	
	
	}

}
