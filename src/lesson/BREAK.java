package lesson;

public class BREAK {

	public static void main(String[] args) {
	
		label: for (int i=0; i<100; i++){
			for (int j=0; j<10; j++){
				if (i>2) break label;
				System.out.println(j);
			}
			
		}

	}

}
