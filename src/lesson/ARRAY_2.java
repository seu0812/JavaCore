package lesson;

public class ARRAY_2 {

	public static void main(String[] args) {
		/*
		  
		 тип имя_мас[][] = new тип[размер][размер];  
		 
		  */
		int mas[][] = new int[5][5];
				
		for (int i=0; i < mas.length; i++){
			for (int j=0; j < mas[i].length; j++){
				mas[i][j] = (int) Math.round(Math.random()*10);
				System.out.print(mas[i][j]+"	");
			}
			System.out.println();
		}
		int count=0;
		for (int i=0; i<mas.length; i++){	
			for (int j=0; j<mas[i].length; j++){
				if (mas[i][j]==0){
					count++;
					j=mas[i].length;
				}
			}
		}
		System.out.println("count: "+count);
	}

}
