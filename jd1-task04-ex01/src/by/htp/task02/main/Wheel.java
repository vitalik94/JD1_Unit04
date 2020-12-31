package by.htp.task02.main;

public class Wheel {
	
	private int diameter;
	private boolean crash;
	
	public Wheel(int diameter, boolean crash) {
		
		this.diameter = diameter;
		this.crash = crash;
		
	}
	
	public void setDiameter(int diameter) {
		
		this.diameter = diameter;
		
	}
	
    public int getDiameter() {
		
		return diameter;
		
	}
    
	public void setCrash(boolean crash) {
		
		this.crash = crash;
		
	}
	
    public boolean getCrash() {
		
		return crash;
		
	}
    
    @Override
    public String toString() {
    	
    	return "diameter" + diameter + "crash" + crash;
    	
    }

}
