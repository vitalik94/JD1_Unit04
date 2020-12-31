package by.htp.task02.main;

public class CarLogic {
	
	public boolean refuel(Car c) {
		
		if(c.getCapacity().getFuel() > 0) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean changeWheel(Car c) {
		
		if(c.getWheel().getCrash() == true) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean drive(Car c) {
		
		if(c.getCapacity().getFuel() > 0 & c.getWheel().getCrash() == false) {
			
			return true;
			
		}
		
		return false;
		
	}

}
