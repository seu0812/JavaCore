package lesson23;

public class main {
	
	public static void main(String[] args) {
		
		Plane plane = new Plane();
		plane.title = "boeing 787";
		plane.capasity = 200;
		plane.speed = 1000;
		

		Plane plane2 = new Plane();
		plane2.title = "boeing 787";
		plane2.capasity = 200;
		plane2.speed = 1000;
		
		/*Plane plane2 = new Plane();
		plane2.title = "boeing 777";
		plane2.capasity = 300;
		plane2.speed = 1200;*/
	
		
		Plane plane3 = plane;
		
		if (plane == plane2)
			System.out.println(1);
		else System.out.println(2); 
		
		if (plane.equals(plane2))
		System.out.println("true");
		else System.out.println("false");
	
		
		//plane.speed +=300;
	
		//System.out.println(plane.speed);
		
	
	}

}
