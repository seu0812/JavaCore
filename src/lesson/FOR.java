package lesson;

public class FOR {

	public static void main(String[] args) {
		int n=0;
		int s=0;
		for (int a=0; a<=100; a++){
			if (a%20==0) {
				
				n++;
				if (n%2==0){
					System.out.println(a);
					s+=a;	
				}
		
			}
		}
		System.out.println("s: "+s);
	}

}
