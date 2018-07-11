package lesson23;

public class Plane {
	
	public String title;
	
	public int capasity;
	
	public int speed;

	public static void main(String[] args) {
		

	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (capasity != other.capasity)
			return false;
		if (speed != other.speed)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
	
	

}
