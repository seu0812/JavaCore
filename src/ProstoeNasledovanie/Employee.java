package ProstoeNasledovanie;

public class Employee extends User{
	
	private double salary; 
	
	public Employee() {
		
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
}
