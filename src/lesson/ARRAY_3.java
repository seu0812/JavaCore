package lesson;

public class ARRAY_3 {

	public static void main(String[] args) {
		
		int mas[][] = new int[5][];
		
		for (int i=0; i<mas.length; i++){
			mas[i] = new int[i+1];
			for (int j=0; j<mas[i].length; j++){
				mas[i][j]=i*j;
			}
		}
		for (int i=0; i<mas.length; i++){
			for (int j=0; j<mas[i].length; j++){
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
