package lesson;

public class ARRAY {

	public static void main(String[] args) {
		int sum=0;
		int n=0;
		int mas[] = new int[10];
		for (int i=0; i<mas.length; i++){
			mas[i]=(int)Math.round(Math.random()*10000);
			 if (mas[i]%4==0){
				sum+=mas[i];
				n++;
				System.out.print(mas[i]+" ");
				}
			
		
		}
		System.out.println("count= "+n);	
		System.out.println("sum: "+sum);
		System.out.println("avg: "+sum/n);
		int min=mas[0];
		for(int i=1; i < mas.length; i++){
			if (min > mas[i]){
				min=mas[i];
			}
		}
		System.out.println("min= "+min); 
	}
}

