package ProstoeNasledovanie;

public class Client extends User{
	
	private String address;
	private double money;
	
	public Client(){
		
	}
	
	public String getAddress() {
		return address;
}
		
	public void setAddress(String address){
		this.address = address;
		
	}
	
	public double getMoney(){
		return money;
		
	}
	public void setMoney(double money){
		this.money = money;
	}
	
	

}
