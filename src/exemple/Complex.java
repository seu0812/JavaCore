package exemple;

public class Complex {
	
	private double real;
	public double im;
	
	public Complex(){
		
	}
	
	public Complex(double real, double im){
		this.real = real;
		this.im = im;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}
	
	public Complex plus(Complex complex){
		double real = this.real + complex.real;
		double im = this.im + complex.im;
		Complex complex2 = new Complex();
		complex2.setReal(real);
		complex2.setIm(im);
		return complex2;
	}

	@Override
	public String toString() {
		return real + " + " + im +" i ";
	}
	
	

}
