package lesson;

public class IF {

	public static void main(String[] args) {
		int a=235;
		int b=12;
		int c=78;
		if (a>b && a>c) {
			b+=a*c*2;
			System.out.println((a+b*c)+(a+c)*3);			
		}else{
			System.out.println("no");
		}
	

		double m=12;
		double n=4;
		m%=5+n*a-34;
		System.out.println("m: "+m);
		
	}

}
