package lesson25;

public class main {
	
	public static void main(String[] args) {
		
		Plane plane = new Plane();
		plane.title = "boeing 787";
		plane.capasity = 200;
		plane.speed = 1000;
		
		Plane plane2 = new Plane();
		plane2.title = "boeing 777";
		plane2.capasity = 300;
		plane2.speed = 1200;
	
		int a = plane2.get(plane2, 250, 32,12);
		System.out.println(a);
		
		plane.get(5, "aaa");
		
		
	
	
		
	
	}

}
