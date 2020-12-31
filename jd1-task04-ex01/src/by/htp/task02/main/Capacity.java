package by.htp.task02.main;

public class Capacity {
	
	private int fuel;
	
	public Capacity(int fuel) {
		
		this.fuel = fuel;
		
	}
	
	public void setFuel(int fuel) {
		
		this.fuel = fuel;
		
	}
	
	public int getFuel() {
		
		return fuel;
		
	}
	
	@Override
	public String toString() {
		
		return "fuel" + fuel;
		
	}

}
