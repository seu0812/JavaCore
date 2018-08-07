package lesson;

public class CONTINUE {

	public static void main(String[] args) {

     for (int i=0; i<100; i++){
    	for (int j=0; j<20; j++){
    		if (j>5) continue;
    		System.out.print(j+" ");
    	}
    	System.out.println();
    }
	System.out.println("stop");

	}

}
