package lesson;

public class FOR_EACH {

	public static void main(String[] args) {
	/*
	  
	  for(объявление: массив/коллекция){
	 	// тело цикла
	  }
	  
	  */
		/* int mas[]=new int[10];
		for (int i=0; i<mas.length; i++){
			mas[i]=i;
		}
		int sum=0;
		for (int value: mas){
			sum += value;
		}
		System.out.println("sum: "+sum);
		*/
		
		int mas[][] = new int[5][8];
		for (int i=0; i < mas.length; i++){
			for (int j=0; j<mas[i].length; j++){
				mas[i][j]=i+j;
			}
		}
		for (int m[]: mas){
			for (int mm: m){
				System.out.print(mm+"	");
			}
			System.out.println();
		}

	}

}
